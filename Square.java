import java.util.Scanner;
import java.lang.Math;
 public class Square{
 	public static void main(String[] agrs)
 	{
 		double num;
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the value");
 		num=sc.nextInt();
        double a=(Math.pow(num,2));
        System.out.println(a);

    }
}
