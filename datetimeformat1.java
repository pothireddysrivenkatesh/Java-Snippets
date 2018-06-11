//DateTimeFormatter class and its methods.

import java.time.format.*;
import java.time.*;
class datetimeformat1{
public static void main(String args[]){
DateTimeFormatter f1 = DateTimeFormatter.ofPattern("y");
DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy");
DateTimeFormatter f3 = DateTimeFormatter.ofPattern("y M d");
DateTimeFormatter f4 = DateTimeFormatter.ofPattern("D");
DateTimeFormatter f5 = DateTimeFormatter.ofPattern("a");
DateTimeFormatter f6 = DateTimeFormatter.ofPattern("e");
DateTimeFormatter f7 = DateTimeFormatter.ofPattern("E");
DateTimeFormatter f8 = DateTimeFormatter.ofPattern("H m");
DateTimeFormatter f9 = DateTimeFormatter.ofPattern("h m");

LocalDateTime dt = LocalDateTime.now();
System.out.println(dt.format(f1));
System.out.println(dt.format(f2));
System.out.println(dt.format(f3));
System.out.println(dt.format(f4));
System.out.println(dt.format(f5));
System.out.println(dt.format(f6));
System.out.println(dt.format(f7));
System.out.println(dt.format(f8));
System.out.println(dt.format(f9));
}
}