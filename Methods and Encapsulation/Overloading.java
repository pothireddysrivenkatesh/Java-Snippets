//Method Overloading.

class Overloading{
public static void main(String args[]){
Overloading o = new Overloading();
o.display(2);
o.display('a');
o.display(4.5);
o.display(4,'a');
o.display('a','b');
o.display(4,4.5);
o.display(4.5,5);
//o.display(4,4);
}
void display(int a){
System.out.println("In int as parameter method");
}
void display(double a){
System.out.println("In float as parameter method");
}
void display(char a){
System.out.println("In char as parameter method");
}
void display(int... a){
System.out.println("In int varargs as parameter method");
}
void display(int a,char b){
System.out.println("In int and char as parameter method");
}
void display(int a,double b){
System.out.println("In int and double as parameter method");
}
void display(double b,int a){
System.out.println("In double and int as parameter method");
}
}