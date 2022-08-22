package duoxiancheng;
import org.omg.PortableServer.THREAD_POLICY_ID;


public class aas extends Thread {
	public  synchronized void run()
	{
		int i=1;
		while(i++<5)
		{
			System.out.println("aaa"+Thread.currentThread().getName());
		}
	}
}
