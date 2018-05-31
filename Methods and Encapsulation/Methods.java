//Creating methods with and without return type and parameters.

class Methods{
int a = 10;
int b = 20;
public static void main(String args[]){
Methods m = new Methods();
m.add(m.a,m.b);
m.sub();
int multiply = m.mul(m.a,m.b);
System.out.println(multiply);
System.out.println(m.div(m.a,m.b));
System.out.println("Is a 'a' lesser than 1000");
System.out.println(m.comparision(m.a));
}
void add(int a,int b){
System.out.println(a+b);
}
void sub(){
System.out.println(this.a-this.b);
}
int mul(int a,int b){
return a*b;
}
int div(int a, int b){
return a%b;
}
boolean comparision(int a){
if(a<1000) return true;
return false;
}
}

