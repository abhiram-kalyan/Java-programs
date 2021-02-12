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
class Fiction extends Book{
 Fiction(String title) {
 super(title);
 	setPrice();
 	}

 	void setPrice(){
 	super.p=24.99;
 	}	
}
class NonFiction extends Book{
	 NonFiction(String title) {
 	super(title);
 	setPrice();
 }

 	void setPrice(){
 	super.p=37.99;
 }
} 
public class UseBook {
 public static void main(String[] args){
	 Book b1,b2;
 	b1=new Fiction("Spider man");
 	System.out.println("price of " + b1.gettitle() + " book is " + b1.getPrice());
	b2=new NonFiction("A Brief History of Time");
	System.out.println("price of " + b2.gettitle() + " book is " + b2.getPrice());
 }
}