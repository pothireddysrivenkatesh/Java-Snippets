//Object Creation, declaration of reference variable and initialization of object.

class Test{
int x;
Test(){
System.out.println("Constructor is being executing.");
}
}

class ObjectCreation{
public static void main(String args[]){
Test t1;
System.out.println("Declared reference Variable for class test.");
System.out.println("Declaration and Initialization of variable follows now.");
Test t2 = new Test();
System.out.println("Initializing without the reference variable.");
new Test();
}
}