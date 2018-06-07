//Polymorphism with Interface.

interface MobileApp{
void deliverApp();
default void update(){
System.out.println("Updated app is in building phase");
}
}

class Employee{}

class Programmer extends Employee implements MobileApp{
public void deliverApp(){
System.out.println("Testing Completed.");
}
}

class Manager extends Employee implements MobileApp{
public void deliverApp(){
System.out.println("Code is ready for delivery");
}
public void update(){
System.out.println("Updated App is ready to Deploy");
}
}

class PolymorphismWithInterfaces{
public static void main(String args[]){
MobileApp ma1 = new Programmer();
MobileApp ma2 = new Manager();
ma1.deliverApp();
ma2.deliverApp();
ma2.update();
}
}