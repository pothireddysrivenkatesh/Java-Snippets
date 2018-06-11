//Period class objects and methods defined in Period.

import java.time.Period;
class period{
public static void main(String args[]){
Period p1 = Period.of(2,2,2);
Period p2 = Period.ofYears(5);
Period p3 = Period.ofMonths(18);
Period p4 = Period.ofWeeks(1);
Period p5 = Period.ofDays(60);
Period p6 = Period.parse("P1Y");
Period p7 = Period.parse("P3M");
Period p8 = Period.parse("P1w");
Period p9 = Period.parse("P-1d");
Period p = Period.parse("P+1Y-3M-6W+20D");

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
System.out.println(p7);
System.out.println(p8);
System.out.println(p9);
System.out.println(p);
}
}
