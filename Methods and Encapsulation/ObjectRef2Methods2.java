//Passing Object references to methods
//When a method modifies the state of the object passed to it.

class Names{
private String name;

Names(String name){
this.name = name;
}

void setName(String name){
this.name = name;
}

String getName(){
return name;
}
}

class ObjectRef2Methods2{
public static void reset(Names n1){
n1.setName("XYZ");
}

public static void main(String args[]){
Names n1 = new Names("ABC");
System.out.println(n1.getName());
reset(n1);
System.out.println(n1.getName());
}
}