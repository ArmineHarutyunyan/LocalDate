import java.time.*;
import java.util.Scanner;

public class DateExcercises3{
    public static void main(String[] args){
        System.out.println("Enter year, please");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, 1, 1);
        if(date.isLeapYear()){
            System.out.println( year + " is a leap year");
        }
        else{
            System.out.println(year + " isn't a leap year");
        }
    }
}

