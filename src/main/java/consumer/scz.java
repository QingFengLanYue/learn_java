package consumer;

public class scz extends Thread {
	public Ck ck;
	public scz (Ck hh){
		ck=hh;
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