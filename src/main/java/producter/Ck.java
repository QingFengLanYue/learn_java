package producter;

public class Ck {
	
	public int num;//��Ʒ����
	public String name;//��Ʒ����
	public int i=0;
	public boolean flag=false; //flag����ʶ��ǰ�ֿ�����û����Ʒ��  false����û����Ʒ    true��������Ʒ
	
	public synchronized void sc() throws InterruptedException
	{
		if(flag) wait();
		if(i++%2==0)
		{
			name="����";
			num=100;
		System.out.println("��������:"+name+"  "+num+" ��");
		}
		else{
			name="����";
			num=200;
		System.out.println("��������:"+name+"  "+num+" ��");
		}
		flag=true;
		notify();
	}
	
	public synchronized void xf() throws InterruptedException
	{	
		if(!flag) wait();
		System.out.println("���������ˣ�������:"+name+"  "+num+" ��");
		notify();
		flag=false;
	}
}
