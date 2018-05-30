//Class variables or static members of a class.

class ClassVariables{
static String Company = "Prolifics";
int EmpID;
String EmpName;
ClassVariables(int EmpID,String EmpName){
this.EmpID = EmpID;
this.EmpName = EmpName;
}
public static void main(String args[]){
ClassVariables cv1 = new ClassVariables(101,"ABC");
ClassVariables cv2 = new ClassVariables(102,"DEF");
ClassVariables cv3 = new ClassVariables(103,"GHI");
ClassVariables cv4 = new ClassVariables(104,"LMN");
System.out.println(cv1.EmpID+" "+cv1.EmpName);
System.out.println(cv2.EmpID+" "+cv2.EmpName);
System.out.println(cv3.EmpID+" "+cv3.EmpName);
System.out.println(cv4.EmpID+" "+cv4.EmpName);
System.out.println(ClassVariables.Company);
ClassVariables.Company = "Prolifics Corp.";
System.out.println(cv1.Company);
System.out.println(cv2.Company);
System.out.println(cv3.Company);
System.out.println(cv4.Company);
System.out.println(ClassVariables.Company);
}
}