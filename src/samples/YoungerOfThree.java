package samples;

import java.util.Scanner;

public class YoungerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age of Ram :  ");
        System.out.println("Enter the age of Sulab :  ");
        System.out.println("Enter the age of Ajay :  ");
		
		Scanner scanner=new Scanner(System.in);
        
        int num1= scanner.nextInt();
        System.out.println("The age of Ram is "  +num1);
        int num2= scanner.nextInt();
        System.out.println("The age of Sulab is "  +num2);
        int num3= scanner.nextInt();
        System.out.println("The age of Ajay is "  +num3);
        
                  
        if((num1<num2)&&(num1<num3))
        {
        	
        System.out.println("Ram is younger");
      	  
        }
        else if((num2<num1)&&(num2<num3))
        {
           
           
            System.out.println("Sulab is younger");
	     }
        else if((num3<num1)&&(num3<num2)) {
        	System.out.println("Ajay is younger");
	}

}

	}


