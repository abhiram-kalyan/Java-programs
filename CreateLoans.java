import java.util.Scanner;
interface LoanConstants {
 public int st = 1;
 public int mt = 3;
 public int lt = 5;
 public String cn = "Sanchez Construction Loan Co.";
 public double max = 100000;
}
abstract class Loan implements LoanConstants {
 String loanNum;
 String lastName;
 double loanAmt;
 double interestRate;
 int term;
 Loan(String loanNum, String lastName, double loanAmt, int term) {
 this.loanNum = loanNum;
 this.lastName = lastName;
 if (loanAmt > max) {
 System.out.println("Loan amount value is more than $100,000");
 }
 else {
 this.loanAmt = loanAmt;
 }
 if(term==st||term==mt||term==lt){
 this.term=term;
 } 
 else{
 this.term=1;
 }
 }
 public String toString() {
 double n =this.loanAmt+(this.loanAmt * this.interestRate);
 return this.lastName + "'s loan number is " + this.loanNum + " his loan amount is " +
this.loanAmt + " with intrest rate of " + this.interestRate +" and total due is " + n + " in term " +
this.term;
 }
}
class BusinessLoan extends Loan {
 BusinessLoan(String loanNum, String lastName, double loanAmt, int term, double primeIntRate) {
 super(loanNum, lastName, loanAmt, term);
 super.interestRate = 0.01 / (primeIntRate / 100);
 }
}
class PersonalLoan extends Loan {
 PersonalLoan(String loanNum, String lastName, double loanAmt, int term, double primeIntRate) {
 super(loanNum, lastName, loanAmt, term);
 super.interestRate = 0.02 / (primeIntRate / 100);
 }
}

public class CreateLoans{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Loan[] l = new Loan[5];
 String ch,ln,lon,p;
 double amt,ir; 
 int term;
 for(int i=0;i<5;i++){
 System.out.println("Enter b for BusinessLoan & p for personal loan");
 if(i!=0){
 sc.nextLine();
 }
 ch=sc.nextLine();
 System.out.println("Enter lastName");
 ln=sc.nextLine();
 System.out.println("Enter loan number");
 lon=sc.nextLine();
 System.out.println("Enter amount");
 amt=sc.nextDouble();
 System.out.println("prime interest rate");
 ir=sc.nextDouble();
 System.out.println("Enter term number");
 term=sc.nextInt();
 if(ch.equals("b")){
 l[i]=new BusinessLoan(lon,ln,amt,term,ir);
 }
 else if(ch.equals("p")){
 l[i]=new PersonalLoan(lon,ln,amt,term,ir);
 }
 else{
 System.out.println("Invalid loan type");
 }
 }
 for(int j = 0;j<5;j++){
 p=l[j].toString();
 System.out.println(p);
 } 
 }
}