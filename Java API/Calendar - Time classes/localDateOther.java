//LocalDate to LocalDateTime and toEpochDay().

import java.time.*;
class localDateOther{
public static void main(String args[]){
LocalDate day = LocalDate.of(2016,5,27);
System.out.println(day.atTime(16,30));
System.out.println(day.atTime(16,30,38));
System.out.println(day.atTime(20,55,59,3666));
System.out.println(day.toEpochDay());
}
}