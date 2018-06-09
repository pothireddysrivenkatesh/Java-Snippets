//Array declaration, allocation,initialization
// and all together in a single line.

class Arrays{
public static void main(String args[]){
int arr[];
String[] sarr;
float farr[];
int[] multiarr[];
arr = new int[5];
sarr = new String[7];
multiarr = new int[5][];
System.out.println(arr);
for(int i = 0;i<arr.length;i++){
arr[i]=i;
}
for(int x:arr){
System.out.println(x);
}
sarr[0]="ABC";
System.out.println(sarr[0]);
int array[] = new int[]{1,5,6,9,12,15,44};
int marray[][] = new int[][]{ {1,2,3},{4,5},{7,8,9} };
for(int []p:marray){
for(int y:p){
System.out.println(y);
}
}
}
}
