package consumer;

public class Ck {
String name;
int num;
int i=2;
public boolean flag=false;
	public synchronized void sc() throws InterruptedException
	{	
		if(flag) wait();
	
		if(i++%2==0)
		{
			name="背心";
			num=i;
			System.out.println("生产了"+num+"件背心");
		}
		else
		{
			name="裤衩";
			num=i;
			System.out.println("生产了"+num+"件裤衩");
			
		}flag=true;
			notify();
	}
	public synchronized void xf() throws InterruptedException
	{	
		if(!flag) wait();
		System.out.println("我来消费了，购买了"+num+"件"+name);
		flag=false;
		notify();
	}


}
