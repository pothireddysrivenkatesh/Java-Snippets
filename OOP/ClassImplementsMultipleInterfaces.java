// A class can implement multiple interfaces.

interface Eat{
int quantity=1;
void digestion();
default void eating(){
System.out.println("Eating..");
}
static boolean givesEnergy(){
return true;
}
}

interface Drink{
int quantity=7;
void digestion();
default void drinking(){
System.out.println("Drinking");
}
default void eating(){
System.out.println("Not Possible to eat liquids");
}
static boolean givesStamina(){
return true;
}
static boolean givesEnergy(){
return false;
}
}

class Man implements Eat,Drink{
public void digestion(){
System.out.println("Digesting food");
}
public void eating(){
System.out.println("Eating Cooked Food");
}
}

class ClassImplementsMultipleInterfaces{
public static void main(String args[]){
Man m = new Man();
m.digestion();
m.eating();
System.out.println("Eating Quantity = "+Eat.quantity);
System.out.println("Drinking Quantity = "+Drink.quantity);
System.out.println(Eat.givesEnergy());
System.out.println(Drink.givesEnergy());
System.out.println(Drink.givesStamina());
}
}
