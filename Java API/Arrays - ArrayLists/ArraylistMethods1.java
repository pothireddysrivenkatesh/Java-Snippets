//ArrayList object element modification and deletion.

import java.util.*;
class ArraylistMethods1{
public static void main(String args[]){
ArrayList<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");
list.add("four");
list.set(2,"error");
for(String s:list){
System.out.println(s);
}


ArrayList<StringBuilder> listsb = new ArrayList<>();
listsb.add(new StringBuilder("one"));
listsb.add(new StringBuilder("two"));
listsb.add(new StringBuilder("three"));
for(StringBuilder s : listsb){
s.append(s.length()+1);
}
for(StringBuilder s : listsb){
System.out.println(s);
} 
list.remove(0);
listsb.remove(new StringBuilder("one4"));
System.out.println(list);
System.out.println(listsb);
}
}