package samples;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the year: " );
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The year is: " +num);
        
        
        if(num%4==0) {
        	System.out.println("This is a leap year");
        }
        else {
        	System.out.println("This is not a leap year");
        }
	}

}
