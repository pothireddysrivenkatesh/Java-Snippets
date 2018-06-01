//Passing Object references to methods
//When a method reassigns the object references passed to it.

class Names{
private String name;

Names(String name){
this.name = name;
}

String getName(){
return name;
}
}

class ObjectRef2Methods1{
public static void swap(Names n1,Names n2){
Names temp = n1;
n1 = n2;
n2 = temp;
}

public static void main(String args[]){
Names n1 = new Names("ABC");
Names n2 = new Names("DEF");
System.out.println(n1.getName()+" - "+n2.getName());
swap(n1,n2);
System.out.println(n1.getName()+" - "+n2.getName());
}
}
