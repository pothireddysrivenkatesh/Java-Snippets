//Methods in StringBuilder class.

class Stringbuilder2{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("Polifics");
sb.insert(1,'r');
System.out.println(sb);
StringBuilder sb1 = new StringBuilder("123");
char[] name = {'j','a','v','a'};
sb1.insert(1,name,1,3);
System.out.println(sb1);
sb1.delete(1,3);
System.out.println(sb1);
sb1.deleteCharAt(1);
System.out.println(sb1);
}
}