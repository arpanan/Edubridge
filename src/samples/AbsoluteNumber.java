package samples;

import java.util.Scanner;

public class AbsoluteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the value: ");
         int num1= scanner.nextInt();
         
         if(num1>0) {
       	  System.out.println(num1+"is absolute number");
       	  
         }
         else 
         {  
         System.out.println(num1+ "is not absolute number");
	      }

	}
}

	


