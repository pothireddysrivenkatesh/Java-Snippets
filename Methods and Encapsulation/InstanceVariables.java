//Instance Variables.

class InstanceVariables{
int IDno;
char typeOfEntry;
InstanceVariables(int IDno, char typeOfEntry){
this.IDno=IDno;
this.typeOfEntry=typeOfEntry;
}
public static void main(String args[]){
InstanceVariables iv1 = new InstanceVariables(101,'A');
InstanceVariables iv2 = new InstanceVariables(102,'B');
InstanceVariables iv3 = new InstanceVariables(103,'C');
InstanceVariables iv4 = new InstanceVariables(104,'D');
System.out.println(iv1.IDno+" "+iv1.typeOfEntry);
System.out.println(iv2.IDno+" "+iv2.typeOfEntry);
System.out.println(iv3.IDno+" "+iv3.typeOfEntry);
System.out.println(iv4.IDno+" "+iv4.typeOfEntry);
iv1.IDno=201;
iv1.typeOfEntry='F';
System.out.println(iv1.IDno+" "+iv1.typeOfEntry);
System.out.println(iv2.IDno+" "+iv2.typeOfEntry);
System.out.println(iv3.IDno+" "+iv3.typeOfEntry);
System.out.println(iv4.IDno+" "+iv4.typeOfEntry);
}
}