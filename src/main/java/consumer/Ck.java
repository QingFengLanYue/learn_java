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
			name="����";
			num=i;
			System.out.println("������"+num+"������");
		}
		else
		{
			name="����";
			num=i;
			System.out.println("������"+num+"������");
			
		}flag=true;
			notify();
	}
	public synchronized void xf() throws InterruptedException
	{	
		if(!flag) wait();
		System.out.println("���������ˣ�������"+num+"��"+name);
		flag=false;
		notify();
	}


}
