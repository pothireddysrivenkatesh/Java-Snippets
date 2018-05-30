//Object reassignment.

class Emp{
String name;
Emp(String name){
this.name=name;
}
}

class ObjectReassign{
public static void main(String args[]){
Emp e1 = new Emp("ABC");
System.out.println(e1);
e1 = null;
e1 = new Emp("LKG");
System.out.println(e1);
System.out.println(e1.name);
}
}