package producter;

public class Scz extends Thread {
	public Ck ck;
	
	public Scz(Ck  fuckyou)
	{
		ck=fuckyou;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				ck.sc();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
