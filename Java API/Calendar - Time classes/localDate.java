//LocalDate class creating dates and accessing them.

import java.time.LocalDate;
class localDate{
public static void main(String args[]){
LocalDate day1 = LocalDate.of(2018,01,25);
System.out.println(day1);
LocalDate day = LocalDate.parse("2015-02-16");
System.out.println(day);
System.out.println(day.getDayOfYear());
System.out.println(day.getMonth());
System.out.println(day.getDayOfWeek());
System.out.println(day.getDayOfMonth());
System.out.println(day.getMonthValue());
System.out.println(day.getYear());
System.out.println(day.isBefore(day1));
System.out.println(day.isAfter(day1));

}
}
