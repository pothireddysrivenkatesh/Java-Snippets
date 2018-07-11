//Arranging a string in its order wise first capitals, smalls, numbers and then followed by characters.
import java.util.*;
public class challenge2 {
	public static void main(String args[]) {
		String s = "AnisnsisNISC321$#";
		String low="";
		String up="";
		String no="";
		String oth="";
		for (int i = 0;i<s.length();i++) {
			char res = s.charAt(i);
			int ans = (int) res;
			if(ans>=65 && ans<=90) {
				String temp = Character.toString(res);
				up = up.concat(temp);
			}
		}
		for (int i = 0;i<s.length();i++) {
			char res = s.charAt(i);
			int ans = (int) res;
			if(ans>=97 && ans<=122) {
				String temp = Character.toString(res);
				low = low.concat(temp);
			}
		}
		for (int i = 0;i<s.length();i++) {
			char res = s.charAt(i);
			int ans = (int) res;
			if(ans>=48 && ans<=57) {
				String temp = Character.toString(res);
				no = no.concat(temp);
			}
		}
		for (int i = 0;i<s.length();i++) {
			char res = s.charAt(i);
			int ans = (int) res;
			if((ans>=33 && ans<=47) || (ans>=58 && ans<=64)) {
				String temp = Character.toString(res);
				oth = oth.concat(temp);
			}
		}
		
		
		char[] charsup = up.toCharArray();
        Arrays.sort(charsup);
        String sortedup = new String(charsup);
        System.out.print(sortedup);
        char[] charslow = low.toCharArray();
        Arrays.sort(charslow);
        String sortedlow = new String(charslow);
		System.out.print(sortedlow);
		char[] charsno = no.toCharArray();
        Arrays.sort(charsno);
        String sortedno = new String(charsno);
		System.out.print(sortedno);
		char[] charsoth = oth.toCharArray();
        Arrays.sort(charsoth);
        String sortedoth = new String(charsoth);
		System.out.print(sortedoth);
	}

}