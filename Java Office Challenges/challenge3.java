//Printing Duplicates in a String.
public class challenge3 {
	public static void main(String args[]) {
			String ip="aaaa"; 
			int count=0; 
			char [] input = ip.toCharArray(); 
			System.out.println("Duplicate Characters are as follows:"); 
			for(int i=0;i<ip.length();i++) 
			{ 
			for(int j=i+1;j<ip.length();j++) 
			{ 
			if(input[i]==input[j]) 
			{ 
			System.out.println(input[j]); 
			count ++; 
			break; 
			} 
			} 
			} 


			} 

			} 
		
	