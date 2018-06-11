//LocalTime class object creation and its methods.

import java.time.*;
class Localtime{
public static void main(String arrgs[]){
LocalTime t1 = LocalTime.of(10,20);
LocalTime t2 = LocalTime.now();
LocalTime t3 = LocalTime.parse("14:30:25");
LocalTime t4 = LocalTime.NOON;
System.out.println(t2.getHour());
//System.out.println(t2.minusMinutes(3));
System.out.println(t2.getSecond());
System.out.println(t2.getNano());
System.out.println(t1);
System.out.println(t2);
System.out.println(t3);
System.out.println(t4);
LocalDate d1 = LocalDate.now();
LocalDateTime dt1 = t2.atDate(d1);
System.out.println(dt1);
}
}