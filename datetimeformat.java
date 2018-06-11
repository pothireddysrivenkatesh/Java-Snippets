//DateTimeFormatter class and its methods.

import java.time.format.*;
import java.time.*;
class datetimeformat{
public static void main(String args[]){
DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
DateTimeFormatter f4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

DateTimeFormatter t1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
DateTimeFormatter t2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

LocalDate d = LocalDate.now();
LocalTime t = LocalTime.now();
System.out.println(d.format(f1));
System.out.println(d.format(f2));
System.out.println(d.format(f3));
System.out.println(d.format(f4));
System.out.println(t.format(t1));
System.out.println(t.format(t2));

}
}