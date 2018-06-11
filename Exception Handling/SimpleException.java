// Simple exception handling.

import java.io.*;
class SimpleException{
public static void main(String args[]){
FileInputStream fis = null;
try{
fis = new FileInputStream("text.txt");
System.out.println("File opened successdully");
fis.read();
System.out.println("Read File");
}
catch(FileNotFoundException fnfe){
System.out.println("File not found");
}
catch(IOException ioe){
System.out.println("I/O Exception");
}
finally{
System.out.println("Finally Block");
}
System.out.println("Next Task");
}
}
