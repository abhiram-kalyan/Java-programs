package MultiThreading;

import java.util.Scanner;
class ColumnThread extends Thread{
	int n;
	int j;
	int[][] arr;
	ColumnThread(int[][] matrix, int n, int j,Nthreads a){
		this.n = n;
		this.j = j;
		this.arr = matrix;
	}
	
	public void run() {
	System.out.println("Thread " + j + " : " + columnSum(this.arr, this.n, this.j));
	try{
		Thread.sleep(100);
	}
	catch(InterruptedException e){
		System.out.println("Stack Trace : " + e);
		}
	}
}
class matrixsum extends Thread{

}
public class Nthreads{
	 int finalSum = 0;
	
	  static int columnSum(int[][] arr, int n, int j){
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += arr[i][j];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creating a 2D matrix of NxN...");
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("Taking input for matrix...");
		int[][] matrix2D = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.println("Enter the number at position " + "(" + (i+1) + ", " + (j+1) + ") : ");
				matrix2D[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Phase 1 : Individual column threads...");
		for(int j = 0; j < n; j++){
			ColumnThread t = new ColumnThread(matrix2D, n, j);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Phase 2: Sum of column sums...");
		sc.close();
	}
}