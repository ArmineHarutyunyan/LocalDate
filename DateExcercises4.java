import java.time.*;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class DateExcercises4{
	public static void main(String[] args){
		System.out.println("Enter date format, please");
		Scanner sc = new Scanner(System.in);
		String format = sc.nextLine();
		if(isValid(format)){
			System.out.println("Enter date of the same format, please");
		}
		
		String s = sc.nextLine();
		int year = Integer.valueOf(s.substring(0, 4));
		int month = Integer.valueOf(s.substring(5, 7));
		int day = Integer.valueOf(s.substring(8, 10));
        
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate dateNow = LocalDate.now();
		Duration duration = Duration.between(date.atStartOfDay(), dateNow.atStartOfDay());
		System.out.println( duration.toDays() + " days.");
	}

	public static boolean isValid(String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
      		dateFormat.parse(format.trim());
      		System.out.println(format + " is Valid date format");
    	} catch (ParseException e) {
    		System.out.println(format + " is Invalid date format!Try again.");
      		return false;
    	}
    	return true;
  	}  	
}