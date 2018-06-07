//Polymorphism with Classes.

class Employee{
String name = "Employee";
void printName(){
System.out.println(name);
}
}

class Programmer extends Employee{
String name = "Programmer";
void printName(){
System.out.println(name);
}
}

class PolymorphismWithClasses{
public static void main(String args[]){
Employee emp1 = new Employee();
Employee emp2 = new Programmer();
System.out.println(emp1.name);
System.out.println(emp2.name);
emp1.printName();
emp2.printName();
}
}
