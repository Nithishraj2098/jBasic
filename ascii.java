import java.util.Scanner;
public class ascii
{
public static void main(String[] agrs){
Scanner sc=new Scanner(System.in);
int a;
int b;
int i;
int sum;
System.out.println("Enter the Range:");
a = sc.nextInt();
b = sc.nextInt();

System.out.println("Ascii value of"+a+"is"+b);
for(i=1;i<=a;i++)
{

System.out.println(""+b+"*"+i+"="+b*i);
}
}
} 
