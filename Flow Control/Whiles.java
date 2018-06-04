//while loop and do-while loop.


class Whiles{
public static void main(String args[]){
WhileLoop(55);
doWhile(120);
}

static void WhileLoop(int a){
System.out.println("The multiples of 5 below "+a+" are ");
while(a>0){

if(a%5==0)
{
System.out.println(a);
}
a--;
}
}

static void doWhile(int a){
System.out.println("The multiples of 10 below "+a+" are"); 
do{
if(a%10==0){
System.out.println(a);
--a;
}
else
--a;
}
while(a>0);
}
}