import java.util.*;
class GenericStack<T>{
 int top;
 int max;
 T [] a;
 GenericStack(int size){
 a=(T[]) new Object[size];
 max=size;
 top=-1;
 }
 void push(T x){
 if(top==(max-1)){
 System.out.println("Stack is Filled");
 }
 else{
 top++;
 a[top]=x;
 }
 }
 T pop(){
 if(top==-1){
 System.out.println("Stack is empty");
 return null;
 }
 else{
 return a[top--];
 }
 }
 void print(){ 
 for (int i=top;i>=0;i--){
 System.out.print(a[i] + " ");
 }
 System.out.println();
 }
}
public class GenericStackDemo{
 public static void main(String[] args) {
 GenericStack<Integer> s =new GenericStack<Integer>(3);
 GenericStack<String> str =new GenericStack<String>(3);
 s.push(11228);
 s.push(220102);
 s.push(310201);
 s.print();
 s.pop();
 s.print();
 str.push("Abhiram");
 str.push("Kalyan");
 str.push("Rama");
 str.print();
 str.pop();
 str.print();
 }
} 