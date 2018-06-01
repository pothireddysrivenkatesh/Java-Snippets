//Passing primitives to methods.

class Test{
int a;
void modify(int x){
x+=1;System.out.println(x);
}
}

class Primitive2Methods{
public static void main(String args[]){
Test t = new Test();
System.out.println(t.a);
t.modify(t.a);
System.out.println(t.a);
}
}