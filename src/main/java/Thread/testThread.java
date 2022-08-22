package Thread;

public class testThread extends Thread {
	public void run()
	{
		int i=0;
		while(i++ <5)
		{
			System.out.println("testThread "+Thread.currentThread().getName());
		}
	}
}
