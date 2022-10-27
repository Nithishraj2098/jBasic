class SingleThread extends Thread{
	public void run()
	{
		System.out.println("Thread");
	}
}
class Single {
	public static void main(String[] agrs)
	{
		SingleThread s=new SingleThread();
		s.start();
	}
}