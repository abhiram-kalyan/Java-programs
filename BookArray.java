public class BookArray{
 public static void main(String[] args) {
 Book b[] = new Book[10];
 b[0] = new Fiction("The Paying Guests");
 b[1] = new Fiction("Nineteen Eighty-Four");
 b[2] = new Fiction("A Tale of Two Cities");
 b[3] = new Fiction("Harry Potter");
 b[4] = new Fiction("Town Like Alice");
 b[5] = new NonFiction("A Brief History of Time");
 b[6] = new NonFiction(" I Know Why the Caged Bird Sings");
 b[7] = new NonFiction("In Cold Blood");
 b[8] = new NonFiction("Bury My Heart at Wounded Knee");
 b[9] = new NonFiction("Hiroshima");
 for(int i=0;i<10;i++){
 System.out.println("price of " + b[i].gettitle() + " book is " + b[i].getPrice());
 }
 }
}