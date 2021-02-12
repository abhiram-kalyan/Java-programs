import java.util.*;
public class Lease{
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