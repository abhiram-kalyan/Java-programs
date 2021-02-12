interface MyMap<K,V>{
 public void add(K k,V v);
 public void remove(K k);
 public int size();
 public boolean isEmpty();
 public K []keys();
 public void print();
}
class MyMapImpl<K,V> implements MyMap<K,V>{
 K a[];
 V b[];
 int p,max,size,ind;
 boolean o;
 MyMapImpl(int n){
 p=-1;
 max=n;
 size = 0;
 a=(K[]) new Object[n];
 b=(V[]) new Object[n];
 }
 public boolean isPresent(K k){
 for (int i=0;i<size;i++){
 if(k.equals(a[i])){
 o=true;
 }
 }
 if(o){
 return false;
 } 
 else{
 return true;
 }
 }
 public void add(K k ,V v){
 if(isPresent(k)){
 if(size==max){
 System.out.println("Map is full");
 }
 else{
 p++;
 a[p]=k;
 b[p]=v;
 size ++;
 }
 }
 else{
 System.out.println(k +" Key is already defined");
 }
 }
 public void remove(K k){
 if(size!=0){
 for(int j=0;j<size;j++){
 if(k.equals(a[j])){
 ind=j;
 }
 }
 for(int l=ind;l<size-ind;l++){
 a[l]=a[l+1];
 b[l]=b[l+1];
 } 
 size--;
 p--;
 }
 else{
 System.out.println("Map is empty");
 }
 }
 public int size(){
 return size;
 }
 public boolean isEmpty(){
 if(size==0){
 return true;
 }
 else{
 return false;
 }
 }
 public K []keys(){
 return a;
 }
 public void print(){
 for(int m=0;m<size;m++){
 System.out.println(a[m] + " : " + b[m]);
 }
 }
}
public class MyMapTest{
 public static void main(String[] args) {
 MyMapImpl<String, Integer> r = new MyMapImpl<String, Integer>(3);
 MyMapImpl<Integer, Double> u = new MyMapImpl<Integer, Double>(3); 
 r.add("Abhriam",524003);
 r.add("Kaushik",521542);
 r.add("Santhosh",245781);
 r.print();
 System.out.println("After removeing one element");
 r.remove("Kaushik");
 r.print();
 r.add("Kalyan",1245);
 System.out.println();
 u.add(7088,665.265);
 u.add(7034,523.245);
 u.add(7110,745.261);
 u.print();
 System.out.println("After removeing one element");
 u.remove(7110);
 u.print();
 System.out.println();
 System.out.println("Is map is empty " + u.isEmpty());
 }
} 