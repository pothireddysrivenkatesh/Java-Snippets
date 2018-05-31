//Constructor Overloading.

class Emp {
String name;
int id;
int x;
Emp(){
//Emp("ABC",22); Illegal to use in this way.
this("ABC",22);
x = 10;
}
Emp(String name,int id){
this.name=name;
this.id=id;
}
}

class OverloadingCons{
public static void main(String args[]){
Emp e = new Emp();
System.out.println(e.x);
}
}