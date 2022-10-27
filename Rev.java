import java.util.Scanner;
public class Rev{
	public static void main(String[] agrs){
		String original,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
			rev=rev+original.charAt(i);
		System.out.println(rev);
	}
}