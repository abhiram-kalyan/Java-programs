import java.util.*;
interface GenericStackable<T>{
 public void push(T x);
 public T pop();
 public void print();
 public boolean isEmpty();
}
class GenericStack<T> implements GenericStackable<T> {
 int top;
 int max;
 T [] a;
 GenericStack(int size){
 a=(T[]) new Object[size];
 max=size; 
 top=-1;
 }
 public void push(T x){
 if(top==(max-1)){
 System.out.println("Stack is Filled");
 }
 else{
 top++;
 a[top]=x;
 }
 }
 public T pop(){
 if(top==-1){
 System.out.println("Stack is empty");
 return null;
 }
 else{
 return a[top--];
 }
 }
 public void print(){
 for (int i=top;i>=0;i--){
 System.out.print(a[i] + " ");
 }
 System.out.println();
 }
 public boolean isEmpty(){
 if(top==-1){
 return true; 
 }
 else{
 return false;
 }
 }
}
public class GenericStackDemo2{
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