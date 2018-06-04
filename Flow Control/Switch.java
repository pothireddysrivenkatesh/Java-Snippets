//switch statement.

class testing{
int x;
void specifier(char a){
if (a>'A' && a<'Z')
x=0;
else if(a>'a' && a<'z')
x=1;
else if(a>'0' && a<'9')
x=2;
else x=3;
switch (x){
case 0:System.out.println("Capital Letters");
break;
case 1:System.out.println("Small Letters");
break;
case 2:System.out.println("Numericcals");
break;
case 3:System.out.println("Others");
break;
}
}
}

class Switch{
public static void main(String args[]){
testing t = new testing();
t.specifier('B');
t.specifier('c');
t.specifier('0');
t.specifier('-');
}
}
