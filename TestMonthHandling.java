import java.time.*;
public class TestMonthHandling{
 public static void main(String[] args) {
 LocalDate mon1;
 LocalDate mon2;
 LocalDate temp1; 
 LocalDate temp2;
 int mo1 = 1;
 int day1 = 31;
 int year = 2020;
 mon1 = LocalDate.of(year, mo1, day1);
 int mo2 = 12;
 int day2 = 31;
 mon2 = LocalDate.of(year, mo2, day2);
 System.out.println("Present dates are " + mon1.getYear() +" " + mon1.getMonth()+
" " + mon1.getDayOfMonth() + " and " + mon2.getYear() +" " + mon2.getMonth()+" " +
mon2.getDayOfMonth());
 temp1 = mon1.plusMonths(1);
 temp2 = mon2.plusMonths(1);
 System.out.println("Dates after adding one month to each " + temp1.getYear() +" " +
temp1.getMonth() + " " + temp1.getDayOfMonth() + " and " + temp2.getYear() +" " +
temp2.getMonth()+" " + temp2.getDayOfMonth() );
 temp1 = mon1.plusMonths(2);
 temp2 = mon2.plusMonths(2);
 System.out.println("Dates after adding two month to each " + temp1.getYear() + " "+
temp1.getMonth() + " " + temp1.getDayOfMonth() + " and " + temp2.getYear() +" " +
temp2.getMonth()+" " + temp2.getDayOfMonth() );
 temp1 = mon1.plusMonths(3);
 temp2 = mon2.plusMonths(3);
 System.out.println("Dates after adding three month to each " + temp1.getYear() + " " + temp1.getMonth() + " " + temp1.getDayOfMonth() + " and " + temp2.getYear() +" " +temp2.getMonth()+" " + temp2.getDayOfMonth() );
 }
}