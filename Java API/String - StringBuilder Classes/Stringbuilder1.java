//StringBuilder object creation 
//and methods in class StringBuilder.

class Stringbuilder1{
public static void main(String args[]){
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder(sb1);
StringBuilder sb3 = new StringBuilder(50);
StringBuilder sb = new StringBuilder("string");
sb.append(" is ");
sb.append(1);
sb.append(" of the classes");
sb.append("Is Java Good?",3,7);
char[] chararr = {'B','y','e'};
sb.append(chararr);
System.out.println(sb);
}
}