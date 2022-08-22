package producter;

public class Ck {
	
	public int num;//商品数量
	public String name;//商品名称
	public int i=0;
	public boolean flag=false; //flag来标识当前仓库中有没有商品，  false代表没有商品    true代表有商品
	
	public synchronized void sc() throws InterruptedException
	{
		if(flag) wait();
		if(i++%2==0)
		{
			name="背心";
			num=100;
		System.out.println("我生产了:"+name+"  "+num+" 件");
		}
		else{
			name="裤衩";
			num=200;
		System.out.println("我生产了:"+name+"  "+num+" 件");
		}
		flag=true;
		notify();
	}
	
	public synchronized void xf() throws InterruptedException
	{	
		if(!flag) wait();
		System.out.println("我来消费了，我买了:"+name+"  "+num+" 件");
		notify();
		flag=false;
	}
}
