//inheritance.

abstract class Employee{
Employee(){
System.out.println("Employee Constructor");
}
String name;
String address;
String mobile;
float experience;
}

class teacher extends Employee{
teacher(){
System.out.println("teacher Constructor");
}
String[] subjects;
void teaching(){}
void printDetails(){
System.out.println("Name of the teacher is "+name);
}
}

class technician extends Employee{
technician(){
System.out.println("technician Constructor");
}
String department;
String[] tools;
void repairs(){}
void printDetails(){
System.out.println("Name of the technician is "+name);
}
}

class inheri1{
public static void main(String args[]){
teacher teach1 = new teacher();
teach1.name = "abc";
teach1.printDetails();
technician tech1 = new technician();
tech1.name = "xyz";
tech1.printDetails();
}
}
