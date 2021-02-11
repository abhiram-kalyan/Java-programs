import java.util.*;
class Lease{
    private String Tenantname;
    int Apartmentnumber;
    double rent;
    int tenure;
    private double total;
    Lease(){
        Tenantname = "XXX";
        Apartmentnumber = 0;
        rent = 1000;
        tenure = 12;
        total = 0;
    }
    public void setName(String Name){
        this.Tenantname = Name;
    }
    public String getName(){
        return Tenantname;
    }
    public void setApartnumber(int Apartnumber){
        this.Apartmentnumber = Apartnumber;
    }
    public int getApartnumber(){
        return Apartmentnumber;
    }
    public void setRent(double Rent){
        this.rent = Rent;
    }
    public double getRent(){
        return rent;
    }
    public void setTenure(int tenure){
        this.tenure = tenure;
    }
    public int getTenure(){
        return tenure;
    }
    public static void explainPetPolicy(){
        System.out.println("10$ is added as a pet fee to the rent amount");
    }
    public void addPetFee(double rent){
        total = 10 + rent;
    }
    public double getaddPetFee(){
        explainPetPolicy();
        System.out.println("The final amount to be paid is "+total);
        return total;
    }
}
public class TestLease{
    public static void main(String args[]){
        Lease person = new Lease();
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the tenants name: ");
        String Name = input.nextLine();
        System.out.println(Name);
        System.out.print("Enter the apartment number: ");
        int Apartnum = input.nextInt();
        System.out.println(Apartnum);
        System.out.print("Enter the Rent amount: ");
        double Rent = input.nextDouble();
        System.out.println(Rent);
        person.setName(Name);
        person.setApartnumber(Apartnum);
        person.setRent(Rent);
        person.addPetFee(Rent);
        person.getaddPetFee();
    }
}