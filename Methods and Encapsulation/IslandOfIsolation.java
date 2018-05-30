//Island of Isolation --> A group of instances 
//with no external references becomes eligible for 
//garbage collection.

class Test{
String name;
Test t1;

Test(String name){
this.name=name;
}

public void setTest(Test test){
t1=test;
}
}

class IslandOfIsolation{
public static void main(String args[]){
Test php = new Test("PHP");
Test java = new Test("Java");

php.t1 = java;
java.t1 = php;
System.out.println(php.t1+" "+java);
System.out.println(java.t1+" "+php);
php = null;
java = null;
}
}