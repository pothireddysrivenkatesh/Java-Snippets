//String Objects Creation using 
//new operator and assignment operator.
//Comparing String objects and their contents.

class StringCreation{
public static void main(String args[]){
String str1 = new String("ABC");
String str2 = new String("ABC");
System.out.println("str1 = "+str1);
System.out.println("str2 = "+str2);
System.out.println("String object created using new, are both equal ? ");
System.out.println(str1==str2);
String str3 = "XYZ";
String str4 = "XYZ";
System.out.println("str3 = "+str3);
System.out.println("str4 = "+str4);
System.out.println("String object created using = operator, are both equal ? ");
System.out.println(str3==str4);
//To compare the contents of String object use eqauls() method.
System.out.println("Comparing contents using equals() Method");
System.out.println(str1.equals(str2));
System.out.println(str4.equals(str3));
}
}
