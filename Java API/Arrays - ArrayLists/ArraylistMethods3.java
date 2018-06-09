//ArrayList methods.

import java.util.*;
class ArraylistMethods3{
public static void main(String args[]){
ArrayList<String> list = new ArrayList<>();
list.add("ABC");
list.add("DEF");
list.add("GHI");
String s = list.get(0);
System.out.println(s+list.size());
System.out.println(list.contains(s));
System.out.println(list.contains("DEF"));
System.out.println(list.contains(new String("GHI")));
System.out.println(list.indexOf(new String("GHI")));
System.out.println(list.indexOf(s));
System.out.println(list.indexOf("GHIp"));


}
}