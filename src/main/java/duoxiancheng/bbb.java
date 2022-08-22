package duoxiancheng;

public class bbb implements Runnable {

	
	public synchronized void run() {
		int i=1;
		while(i++<5)
		{
		System.out.println("bbb"+Thread.currentThread().getName());
		}				
	
	}

}
