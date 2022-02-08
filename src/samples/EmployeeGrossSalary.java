package samples;

import java.util.Scanner;

public class EmployeeGrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Basic salary of employee: " );
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The basic salary of the employee is: " +num);
        int HRA=num*10/100; 
        int DA= num*90/100;
        int total= num+HRA+DA;
       
        int HRA1=500; 
        int DA1= num*98/100;
        int total1=num+HRA1+DA1;
                
           if(num<1500) { 
        	   HRA=num*10/100; 
               DA= num*90/100;
               total= num+HRA+DA;
        	System.out.println("the gross salary is : " +total);
            
        }
           else if(num>=1500) 
           {
        	   HRA1=500; 
               DA1= num*98/100;
               total1=num+HRA1+DA1; 
        	   
        	   
        	   System.out.println("the gross salary is : " +total1); 
           }
        
        }
	}


