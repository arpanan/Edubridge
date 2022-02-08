package samples;
import java.util.Scanner;
public class IndentificationOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the Character: " ); 
        Scanner scanner =new Scanner(System.in);
        String str= scanner.next();
        char ch= str.charAt(0);
        int num1 =scanner.nextInt();
        if((ch>=65)&&(ch<=90)) {
     	       A to Z;
        }
        else if((percentage>=50)&&(percentage<=59)) {
     	   System.out.println("The division of student is second");
        }
        else if((percentage>=40)&&(percentage<=49)) {
     	   System.out.println("The division of student is third");
        }
        else if(percentage<40) {
     	   System.out.println("The student has failed");
        }
 	}
        
	}

}
