//Password validation.
import java.util.*;
public class challenge4 {
public static void main(String []args) {
	String pwd;
	int up=0;
	int low=0;
	int spl=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Create a User name");
	String usr = sc.next();
	System.out.println("Enter password");
	pwd = sc.next();
	if(pwd.equals(usr)) {
		System.out.println("User name can not be Password");
	}
	if(pwd.length()<8 || pwd.length()>20) {
		System.out.println("Password must contain atleast 8 to 20 characters");
	}
		for (int i = 0;i<pwd.length();i++) {
		char res = pwd.charAt(i);
		int ans = (int) res;
		if(ans>=97 && ans<=122) {
			low = 1;
		}
	}
	for (int i = 0;i<pwd.length();i++) {
		char res = pwd.charAt(i);
		int ans = (int) res;
		if(ans>=65 && ans<=90) {
				up=1;
		}
	}
	for (int i = 0;i<pwd.length();i++) {
		char res = pwd.charAt(i);
		int ans = (int) res;
		if((ans>=33 && ans<=46)|| ans == 64) {
			spl=1;
		}
	}
	if(up==0)System.out.println("Password must contain one Upper case Letter");
	if(low==0)System.out.println("Password must contain one lower case Letter");
	if(spl==0)System.out.println("Password must contain one special case Letter");
	sc.close();
	}
}