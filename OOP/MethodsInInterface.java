//Types of methods in an interface.

interface in1{
int age = 10;
void printAge();
default void printAge1(){
System.out.println("In default Method "+age);
}
static void printAge2(){
System.out.println("In static method "+age);
}
}

class MethodsInInterface implements in1{
public void printAge(){
System.out.println("Implementing method "+age);
}
public static void main(String args[]){
MethodsInInterface m1 = new MethodsInInterface();
m1.printAge();
m1.printAge1();
in1.printAge2();
}
}
