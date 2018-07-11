//Printing 3-digit numbers in which first and last digit sum is middle digit.
public class c1 {
	public static void main(String args[]) {
		int a;
		for(a=121;a<999;a++)
		{
			int last,first ,ans,middle;
			last=a%10;
			first=a/100;
			middle = a/10;
			middle = middle % 10;
			ans = first + last;
			if(middle == ans)
				System.out.println(a);
		}
		
	}

}
