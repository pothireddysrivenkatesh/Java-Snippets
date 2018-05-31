//Constructors --> User-Defined Constructors.

class Emp{
int id;
String name;
int a = 0;
{
System.out.println("Initializer block - 0 of Emp");
System.out.println(a);
}
Emp(String name,int id){
this.name=name;
this.id=id;
System.out.println("In Contructor");
}
{
System.out.println("Initializer block - 1 of Emp");
}
{System.out.println("Initializer block - 2 of Emp");}
}
class UserDefinedCons{
public static void main(String args[]){
Emp e = new Emp("ABC",21);
}
}