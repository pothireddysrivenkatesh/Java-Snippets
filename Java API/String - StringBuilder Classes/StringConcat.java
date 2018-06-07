//String Concatenation using + and += operator.

class StringConcat{
public static void main(String args[]){
String s = "OCA"+" Learning"+" Plan";
System.out.println(s);
int num = 10;
int val = 12;
String str1 = s + num + val;
System.out.println(str1);
String str2 = num + val + s;
System.out.println(str2);
String s1 = null;
s1+=s;
System.out.println(s1);
}
}