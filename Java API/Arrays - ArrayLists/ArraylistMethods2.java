//Adding an Arraylist to another ArrayList.

import java.util.*;
class ArraylistMethods2{
public static void main(String args[]){
ArrayList<StringBuilder> list1 = new ArrayList<>();
list1.add(new StringBuilder("one"));
list1.add(new StringBuilder("two"));
list1.add(new StringBuilder("three"));
ArrayList<StringBuilder> list2 = new ArrayList<>();
list2.add(new StringBuilder("four"));
list2.add(new StringBuilder("five"));
list2.add(new StringBuilder("six"));
list1.addAll(3,list2);
System.out.println(list1);
for(StringBuilder s : list2){
s.append("1");
}
System.out.println(list1);
}
}