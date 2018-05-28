// Arithematic Operators

class ArithmaticOperators{
public static void main(String args[]){

byte b1 = 100;
byte b2 = 100;
int s1 = b1 + b2; //Implicit Widening of data types byte vs byte.
System.out.println(s1);
int i1 = 1024;
long l1 = 22556l;
long s2 = i1+l1;//Implicit Widening of data types int vs long.
System.out.println(s2);
float f1 = 15.6f;
float s3 = f1+b1;//Implicit Widening of data types float vs float.
System.out.println(s3);
char ch = 'a';
int i2 = ch + i1;//Implicit Widening of data types char vs int.
System.out.println(i2);
float s4 = f1 + s3;//Implicit Widening of data types float vs float.
System.out.println(s4);

final short sh1 = 100;
final short sh2 = 200;
short sh3 = sh1 + sh2;
System.out.println(sh3);

System.out.println(ch);
System.out.println(ch+ch);
System.out.println(ch-ch);
System.out.println(ch*ch);
System.out.println(ch/ch);
System.out.println(ch+10);
ch+=10;
System.out.println(ch);
}
}