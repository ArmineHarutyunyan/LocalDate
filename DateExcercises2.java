import java.time.*;

public class DateExcercises2{
	public static void main(String[] args){
		LocalDate date = LocalDate.now();
		printFridays(date);		
	}

	public static void printFridays(LocalDate date){
		for(int i = 0; i < 7; i++){
			date = date.plusDays(1);
			if(date.getDayOfWeek() == DayOfWeek.FRIDAY){
				System.out.println(date.minusWeeks(1));
				System.out.println(date);
				break;
			}
		}
	}
}
