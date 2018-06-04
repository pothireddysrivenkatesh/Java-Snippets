//Interfaces

interface Calling{
//int myNumber;
void receiveCall();
void dailNumber(String Number);
}

interface Gaming{
//int resolution;
void startGame();
void closeGame();
}

class Tablet implements Gaming{
int resolution = 1024;
public void startGame(){
System.out.println("Loading");
}
public void closeGame(){
System.out.println("Closing Game");
}
}

class Mobile implements Calling,Gaming{
int myNumber=1234;
public void receiveCall(){
System.out.println("Incoming Call");
}
public void dailNumber(String Number){
System.out.println("Dailing..."+Number);
}
public void startGame(){
System.out.println("Mobile Loading");
}
public void closeGame(){
System.out.println("Mobile Closing Game");
}
}

class interface1{
public static void main(String args[]){
Tablet t = new Tablet();
Mobile m = new Mobile();
t.startGame();
t.closeGame();
m.startGame();
m.closeGame();
m.dailNumber("12345");
m.receiveCall();
}
}



