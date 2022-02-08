package samples;
import java.util.Scanner;

public class DivisionObtainedByStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the marks obtained in sub1");
      System.out.println("Enter the marks obtained in sub2");
      System.out.println("Enter the marks obtained in sub3");
      System.out.println("Enter the marks obtained in sub4");
      System.out.println("Enter the marks obtained in sub5");
            Scanner scanner =new Scanner(System.in);
       int num1=scanner.nextInt();
       System.out.println("The marks obtained in subject1 : " +num1);     
       int num2=scanner.nextInt();
       System.out.println("The marks obtained in subject2 : " +num2);   
       int num3=scanner.nextInt();
       System.out.println("The marks obtained in subject3 : " +num3);   
       int num4=scanner.nextInt();
       System.out.println("The marks obtained in subject4 : " +num4);   
       int num5=scanner.nextInt();
       System.out.println("The marks obtained in subject5 : " +num5);   
       int total = ((num1+num2+num3+num4+num5));
       System.out.println("The total is : " +total);
       int average = ((total)/(5));
       System.out.println("The average is : " +average);   
       int percentage= ((total*100)/500);
       System.out.println("The percentage of the student is : " +percentage); 
       if(percentage>=60) {
    	   System.out.println("The division of student is first");
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
