import java.util.Scanner;
public class MoneyExchange{
	public static void main(String[] agrs){
		int num;
		String from,to;
		System.out.println("(Select one)\nFROM:\n USD\n Russia\n India");
		Scanner sc=new Scanner(System.in);
		from=sc.nextLine();
		System.out.println("(Select one)\nTo:\n India\n USD\n Russia");
		to=sc.nextLine();
		System.out.println("Enter the number boss : ");
		num=sc.nextInt();
		if(from.equals("India")&&to.equals("USD")){
			System.out.println(num*70);
		}
		if(from.equals("India")&&to.equals("Russia")){
			System.out.println(num*50);
		}
		if(from.equals("India")&&to.equals("India")){
			System.out.println(num);
		}
		if(from.equals("USD")&&to.equals("India")){
			System.out.println(num/70);
		}
		if(from.equals("USD")&&to.equals("USD")){
			System.out.println(num);
		}

	}
}