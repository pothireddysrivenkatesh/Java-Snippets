// Assignment Operators =,+=,-=,*=,/=,%=.

class AssignmentOperators{
public static void main(String args[]){
int x = 15;
int y = 6;
x+=y;
System.out.println(x);
x-=y;
System.out.println(x);
x*=y;
System.out.println(x);
x/=y;
System.out.println(x);
int z = 55;
System.out.println("The values of x,y and z are as follows "+x+" "+y+" "+z);
x=y=z;
System.out.println("The values of x,y and z are as follows after x=y=z "+x+" "+y+" "+z);
}
}