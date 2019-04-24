import java.time.*;
import java.util.Scanner;

public class DateExcercises1{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age, please");
        int age = sc.nextInt();
        System.out.println("Year of your birth is " + (currentYear - age));
    }
}