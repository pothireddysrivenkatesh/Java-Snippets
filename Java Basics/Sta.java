//Static variables

class stat{
static String Bankname;
static int IFSC;
}

class Sta{
public static void main(String args[]){
stat s1 = new stat();
s1.Bankname = "SBI";
s1.IFSC = 123456;
stat s2 = new stat();
s2.Bankname = "HDFC";
s2.IFSC = 456789;
System.out.println(s1.Bankname);
System.out.println(s2.Bankname);
System.out.println(s1.IFSC);
System.out.println(s2.IFSC);
System.out.println(stat.Bankname);
}
}