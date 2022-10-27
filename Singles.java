// using interface method Theard
class SingleTheard implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++){
			System.out.println(""+i);
		}
	}
}
public class Singles{
	public static void main(String[] agrs){
		SingleTheard s= new SingleTheard();
		Thread t=new Thread(s);
		t.start();
	}
}