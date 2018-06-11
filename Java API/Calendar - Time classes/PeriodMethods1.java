//Period class methods.

import java.time.Period;
import java.time.LocalDate;
class PeriodMethods1{
public static void main(String args[]){
LocalDate d1 = LocalDate.parse("2011-05-27");
LocalDate d2 = LocalDate.parse("2011-11-24");
Period p = Period.between(d1,d2);
System.out.println(p);
System.out.println(d2.plus(Period.ofDays(39)));
System.out.println(d2.minus(Period.ofMonths(1)));
System.out.println(p.getYears());
System.out.println(p.getMonths());
System.out.println(p.getDays());
System.out.println(p.isZero());



}
}