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
	/* NumberFormatException
	int year = Integer.parseInt(sc.next());
        String operator = sc.next();
        int month = Integer.parseInt(sc.next());
        String operator2 = sc.next();
        int day = Integer.parseInt(sc.next());
        */
		LocalDate date = LocalDate.of(2014, 03, 25);
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
