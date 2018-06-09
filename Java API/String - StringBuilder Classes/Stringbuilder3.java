//Methods in StringBuilder class.

class Stringbuilder3{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("0123456");
sb.replace(1,2,"ABCD");
System.out.println(sb);
System.out.println(sb.subSequence(1,5));
System.out.println(sb);
}
}