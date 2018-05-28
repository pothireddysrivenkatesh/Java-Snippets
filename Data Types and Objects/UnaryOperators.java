//Unary Operators.

class UnaryOperators{
public static void main(String args[]){
int a = 10;
int b = 20;
int c = a + b--;
System.out.println(c);
int f = 100;
f = f++ + f + f-- - f-- + ++f;
System.out.println(f);
int e = 100;
e = --e - e - ++e + ++e - e--;
System.out.println(e);
}
}