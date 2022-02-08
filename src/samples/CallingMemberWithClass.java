package samples;

public class CallingMemberWithClass {
	int a=20;

   void call() {
	 System.out.println("Hello user");
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hhkll");
         
            
            CallingMemberWithClass cm = new CallingMemberWithClass();
            System.out.println(cm.a);
            cm.call();
            cm.display();
	}
	void display() {
		System.out.println(a);
		
	}
	    

}
