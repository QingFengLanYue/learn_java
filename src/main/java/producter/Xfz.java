package producter;

public class Xfz extends Thread {
	public Ck ck;
	
	public Xfz(Ck  fuckyou)
	{
		ck=fuckyou;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				ck.xf();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
