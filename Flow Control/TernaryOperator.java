//Ternary Operator.

class test{
float bill;
float finalbill(float totalBill){
bill=totalBill;
float discAmount = ((totalBill<2000)&&(totalBill>1000)?spldisc():((totalBill<1000)&&(totalBill>500))?regdisc():totalBill);
return discAmount;
}
float spldisc(){
return bill-200;
}

float regdisc(){
return bill-(100);
}
}
class TernaryOperator{
public static void main(String main[]){
test t = new test();
System.out.println("Final bill for 1500 is "+t.finalbill(1500));
System.out.println("Final bill for 2500  is "+t.finalbill(2500));
System.out.println("Final bill for 100is "+t.finalbill(100));
}
}
