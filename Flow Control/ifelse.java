//if - else statements.

class test{
void compare(int marks){
if((marks<=100)&&(marks>0)){
if(marks>=70) System.out.println("Congratulations You cleared the exam with distinction");
else if((marks<70)&&(marks>=60)) System.out.println("Congratulation You cleared the exam in First class.");
else if ((marks<60)&&(marks>=50)) System.out.println("Congratulations You cleared the exam in Second class.");
else if ((marks<50)&&(marks>=40)) System.out.println("Congratulations You cleared the exam in Third class.");
else if(marks<40) System.out.println("Result : FAIL Sorry.");
}
else System.out.println("Please enter the marks in proper range.");
}
}

class ifelse{
public static void main(String args[]){
test t = new test();
t.compare(10);
t.compare(40);
t.compare(50);
t.compare(60);
t.compare(70);
t.compare(100);
}
}