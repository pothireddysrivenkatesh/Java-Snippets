
public class challenge5 {
	public static void main(String args[]) {
		String str = "ABCAa1jsa1";
		int flag = 10;
		for(int i =0;i<str.length();i++) {
			for(int j = 1;j<str.length();j++) {
				if(i==j) {continue;}
				if(str.charAt(j)==str.charAt(i)) {
					flag=flag+i;
					flag=flag*10;
					System.out.println("Repeated Character is "+str.charAt(i));	}
				}
				if(flag%10==i)
					continue;
			}
		}
		
	}

