//Encapsulation.

class Student{
private String name;
private int age;

void setDetails(String name,int age){
this.name = name;
if(age>5 && age <18)
this.age = age;
else System.out.println("Enter Proper age between 5 to 18");
}

String getName(){
return name;
}

int getAge(){
return age;
}
}

class Encapsulation{
public static void main(String args[]){
Student s = new Student();
s.setDetails("ABC",15);
System.out.println("Name of Student is "+s.getName()+" and age is "+s.getAge());
}
} 
 