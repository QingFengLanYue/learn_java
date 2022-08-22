package Runnable;

public class testRunnable implements Runnable {

	public void run() {
		int i=0;
		while(i++ <5)
		{
			System.out.println("testRunnable "+Thread.currentThread().getName());
		}
	}

}
