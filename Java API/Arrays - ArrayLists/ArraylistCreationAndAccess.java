// ArrayList object creation and accessing elements in them.

import java.util.*;
class ArraylistCreationAndAccess{
public static void main(String args[]){
ArrayList<String> list = new ArrayList<>();
list.add("one");
list.add("two");
list.add("three");
list.add("four");
list.add(3,"three and half");
for(String s:list){
System.out.println(s);
}
Iterator<String> iter = list.listIterator();
while(iter.hasNext())
{
System.out.println(iter.next());
}
}
}