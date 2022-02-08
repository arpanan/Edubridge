package samples;

import java.util.Scanner;

public class TriangleValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 1st angle:  ");
        System.out.println("Enter the 2nd angle:  ");
        System.out.println("Enter the 3rd angle :  ");
		
		Scanner scanner=new Scanner(System.in);
        
        int num1= scanner.nextInt();
        System.out.println("The 1st angle is "  +num1);
        int num2= scanner.nextInt();
        System.out.println("The 2nd angle is "  +num2);
        int num3= scanner.nextInt();
        System.out.println("The 3rd angle is "  +num3);
               int total = num1+num2+num3;
        System.out.println("The sum of the angle of triangle : "  +total);   
        
        if(total==180)
        {
        	
        System.out.println("Triangle is valid");
        }
      	  
       
        else
        {
           
           
            System.out.println("Triangle is not valid");
	     }
        

	}

}
