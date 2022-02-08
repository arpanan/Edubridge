package samples;

import java.util.Scanner;

public class CalculateTheTotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the quantity :  ");
        System.out.println("Enter the price :  ");
        double num1= scanner.nextDouble();
        System.out.println("the quantity of item "  +num1);
        double num2= scanner.nextDouble();
        System.out.println("the price per item "  +num2);
        
        double total1= num1*num2;
        System.out.println("the total expenses " +total1);
        
        if(total1>5000) {
      	  System.out.println("10 percent discount is offered");
      	  
        }
        else 
        {  
        System.out.println("10 percent discount is not offered");
	      }
	}

}
