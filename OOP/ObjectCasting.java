//Reference type Vs Object type.

class Employee{
String name;
String address;
String phoneNumber;
float experience;
}

interface Interview{
void conductInterview();
}

class HREx extends Employee implements Interview{
String s = new String("HR");
public void conductInterview(){
System.out.println("HR Executive Interview");
}
}

class Manager extends Employee implements Interview{
String s = new String("Manager");
public void conductInterview(){
System.out.println("Manager Interview");
}
}

class ObjectCasting{
public static void main(String args[]){

HREx hr = new HREx();
hr.name="ABC";
System.out.println(hr.name);
hr.conductInterview();
System.out.println(hr.s);

Employee emp = new HREx();
emp.name="BCD";
System.out.println(emp.name);
((HREx)emp).conductInterview();
System.out.println(((HREx)emp).s);

Interview in = new HREx();
((HREx)in).name="ABC";
System.out.println(((HREx)in).name);
in.conductInterview();
System.out.println(((HREx)in).s);
}
}