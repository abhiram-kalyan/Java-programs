abstract class Book {
 String t;
 double p;

 Book(String title ){
 t=title;
 }

 String gettitle(){
 return t;
 }

 double getPrice(){
 return p;
 }

 abstract void setPrice();
}