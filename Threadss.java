import java.util.*;
public class Threadss extends Thread{
	public void run(){
		System.out.println("Hi");
	}
	public static void main(String[] agrs){
		Threadss t=new Threadss();
		t.start();


	}
}
/*	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		float c=0;
		
		try{
			c=(float)(num1)/num2;
			
		}
		
		catch(ArithmeticException ae){
			System.err.println("Check the number");
		}
		
		
		finally{
			System.out.println("Thanks for using");
		}
		System.out.println(c);
	}
}*/