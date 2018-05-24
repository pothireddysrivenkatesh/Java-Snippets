//Abstract Nonaccess Modifier

abstract class Test{
public void m1(){}
abstract public void m2();
}

class Abs{
public static void main(String args[]){
Test t1 = new Test();//testing whether object creation is possible.
System.out.println("Created object for Test");
}
}

interface Inter{}
