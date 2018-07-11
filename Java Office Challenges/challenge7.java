//From a given date calculating the no of week days in backward given no of days.
import java.time.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class challenge7 {
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
		d1 = d1.minusDays(days);
		DayOfWeek day=d1.getDayOfWeek();
		int com = day.getValue();
		if(com==6)
			d1=d1.minusDays(2);
		if(com==7)
			d1=d1.minusDays(1);
		System.out.println("Previous working day is :"+d1);
	}

}
