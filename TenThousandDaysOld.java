import java.time.*;
public class TenThousandDaysOld{
 public static void main(String[] args) {
 LocalDate dob;
 int mo = 7;
 int day = 22;
 int year = 2001;
 dob = LocalDate.of(year, mo, day);
 System.out.println("Born on " + dob.getYear() +" " + dob.getMonth() + " " +
dob.getDayOfMonth());
 dob=dob.plusDays(10000);
 System.out.println("Date on which I become 10,000 days old is " + dob.getYear() +" " + dob.getMonth()+ " " + dob.getDayOfMonth());
 }
} 
