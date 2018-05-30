//Method parameters.

class MethodParameters{
public static void main(String args[]){
MethodParameters mp1 = new MethodParameters();
mp1.display(5);
}

public void display(int a){
int threshold = 5;
if (a<threshold){
System.out.println("Method argument is too low");
}
else {
System.out.println("Method Argument is equal to or above 5");
} 
}
}