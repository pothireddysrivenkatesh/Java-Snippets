class MutliReturn{
public static void main(String args[]){
System.out.println(get());
}

public static int get(){
int rval = 10;
try{
String[] stu={"sai","sri"};
System.out.println(stu[3]);
}
catch(Exception e){
System.out.println(e);
return rval;
}
finally{
rval = rval + 10;
return rval;
}
//return rval;
}
}