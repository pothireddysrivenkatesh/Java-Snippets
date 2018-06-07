//Object references using keywords this and super.

class Employee{
String name;
String address;
Employee(String name,String address){
this.name = name;
this.address = address;
}
}

class Programmer extends Employee{
String skills;
Programmer(String name,String address,String skills){
super(name,address);
this.skills = skills;
}
void details(){
System.out.println(this.name+this.address+this.skills);
}
}

class ObjectReferencesKW{
public static void main(String args[]){
Programmer p1 = new Programmer("abc","hyd","java");
p1.details();
}
}

