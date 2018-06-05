//Interfaces extending mutliple interfaces.

interface IN1{
String getName();
default void def(){
System.out.println("Default of IN1");
}
static void meth(){
System.out.println("Static method of IN1");
}
}

interface IN2{
String getName();
default void def(){
System.out.println("Default of IN2");
}
static void meth(){
System.out.println("Static method of IN2");
}
}

interface New extends IN1,IN2{
default void def(){
System.out.println("Overriding Default method with same name");
}
}

class InterfaceExtendsMultipleInterfaces implements New{
public static void main(String args[]){
InterfaceExtendsMultipleInterfaces m = new InterfaceExtendsMultipleInterfaces ();
m.getName();
m.def();
//IN1.super.def(); This is'nt working as explained in the book in pg no.444
//IN2.super.def(); This is'nt working as explained in the book in pg no.444
IN1.meth();
IN2.meth();
}
public String getName(){
System.out.println("Implementing getName");
return null;
}
}
