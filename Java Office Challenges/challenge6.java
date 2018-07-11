//From a given date calculating the no of weekend days in next given no of days.
import java.time.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class challenge6 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int year,month,date;
		System.out.println("Enter Year");  
		year=sc.nextInt(); 
		System.out.println("Enter Month");  
		month=sc.nextInt();
		System.out.println("Enter Date");  
		date=sc.nextInt();
		LocalDate d1 = LocalDate.of(year,month,date);
		System.out.println("Enter no. days ");
		int days = sc.nextInt();
		d1 = d1.plusDays(days);
		DayOfWeek day=d1.getDayOfWeek();
		int com = day.getValue();
		if(com==1)
			d1=d1.plusDays(5);
		if(com==2)
			d1=d1.plusDays(4);
		if(com==3)
			d1=d1.plusDays(3);
		if(com==4)
			d1=d1.plusDays(2);
		if(com==5)
			d1=d1.plusDays(1);
		System.out.println("No of Weekend Days are :"+d1);
	}

}
