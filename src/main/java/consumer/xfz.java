package consumer;

public class xfz extends Thread {
	public Ck ck;
	public xfz (Ck hh){
		ck=hh;
	
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

