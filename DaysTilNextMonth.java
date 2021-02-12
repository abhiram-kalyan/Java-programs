import java.time.*;
public class DaysTilNextMonth{
 public static void main(String[] args) {
 LocalDate mon;
 LocalDate temp;
 int mo = 6;
 int day = 12;
 int year = 2010;
 mon = LocalDate.of(year, mo, day);
 int remain = mon.lengthOfMonth() - day;
 System.out.println("Todays date " + mon.getYear() + " " + mon.getMonth()+ " " +
mon.getDayOfMonth());
 System.out.println("Reamining days in these month is " + remain + " days");
 mon = mon.plusMonths(1);
 System.out.println("Next month is " + mon.getMonth());
 }
}