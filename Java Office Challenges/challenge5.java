//From a given date calculating the no of working days in next given no of days.
import java.time.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class challenge5 {
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
		if(com==6)
			d1=d1.plusDays(2);
		if(com==7)
			d1=d1.plusDays(1);
		System.out.println("Next working day is :"+d1);
	}

}
