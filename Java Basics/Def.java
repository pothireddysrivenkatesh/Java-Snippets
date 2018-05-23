//Default Access modifier


class cls{
int no=20;
void print(){
System.out.println(no);
}
}

class Def{
public static void main(String args[]){
cls d1=new cls();
d1.print();
}
}