//String class Methods.

class StringMethods{
public static void main(String args[]){
String str1 = new String("  ABCDEFGHABCDE  ");
System.out.println(str1.charAt(0));
System.out.println(str1.charAt(5));
System.out.println(str1.indexOf('A'));
System.out.println(str1.indexOf('a'));
System.out.println(str1.indexOf("ABC"));
System.out.println(str1.indexOf("ABC",3));
System.out.println(str1.substring(4));
System.out.println(str1.substring(1,4));
System.out.println(str1.trim());
System.out.println(str1.replace("B","2"));
System.out.println(str1.replace('C','3'));
System.out.println(str1.length());
System.out.println(str1.startsWith("  A"));
System.out.println(str1.startsWith("BCDE",3));
System.out.println(str1.endsWith("  "));
System.out.println(str1);
}
}