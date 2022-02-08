package samples;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the selling price :  ");
        System.out.println("Enter the cost price :  ");
        double num1= scanner.nextDouble();
        System.out.println("the selling price of the item "  +num1);;
        double num2= scanner.nextDouble();
        System.out.println("the cost price of the item "  +num2);
        double profit= num1-num2;
        System.out.println("The profit is "  +profit);
        double loss=num2-num1;
         System.out.println("The loss is"  +loss);              
        
        if(num1>num2)
        {
        	
        System.out.println("The man incurred profit : " +profit);
      	  
        }
        else
        {
           
           
            System.out.println("The man incurred loss : " +loss);
	     }
	}

}
