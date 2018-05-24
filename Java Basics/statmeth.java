//Static methods

class utilit{
static int SumOfFirstHundredNum(){
int j = 0;
for (int i=0;i<=100;i=i+1)
{
j=j+i;
}
return j;
}
}

class statmeth{
public static void main(String args[]){
int x = utilit.SumOfFirstHundredNum();
System.out.println(x);
}
}