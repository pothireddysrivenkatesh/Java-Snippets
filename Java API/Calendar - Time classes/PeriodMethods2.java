//Period class methods.

import java.time.Period;
import java.time.LocalDate;
class PeriodMethods2{
public static void main(String args[]){
Period p1y = Period.ofYears(1);
Period p1m = Period.parse("P1M");
Period p30d = Period.parse("P30D");
System.out.println(p1y.minus(p1m));
System.out.println(p1y.minusMonths(2));
System.out.println(p1m.plusMonths(11));
System.out.println(p1y.plusMonths(12));
System.out.println(p1y.withMonths(1));
}
}