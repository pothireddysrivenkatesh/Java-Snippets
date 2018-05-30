//Local Varaibles or method variables.

class LocalVariables{

public static void main(String args[]){
LocalVariables lv1 = new LocalVariables();
lv1.setchairs(100);
}

public void setchairs(int chair){
int chairs=chair;
if (chairs<50)
{
System.out.println("More chairs are required.");
}
else
{
System.out.println("Chairs are enough in number.");
}
System.out.println(chairs);
}
}
