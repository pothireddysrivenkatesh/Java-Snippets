//LocalDate manipulating dates
//with minusXX(), plusXX()and withXX().

import java.time.*;
class localDateManipulate{
public static void main(String args[]){
LocalDate day = LocalDate.of(2016,11,24);
System.out.println(day.minusDays(2));
System.out.println(day.minusWeeks(2));
System.out.println(day.minusYears(1));
System.out.println(day.minusMonths(2));
System.out.println(day);
System.out.println(day.plusDays(2));
System.out.println(day.plusWeeks(5));
System.out.println(day.plusMonths(6));
System.out.println(day.plusYears(2));
System.out.println(day);
System.out.println(day.withDayOfMonth(5));
System.out.println(day.withDayOfYear(58));
System.out.println(day.withMonth(5));
System.out.println(day.withYear(1999));
System.out.println(day);
}
}