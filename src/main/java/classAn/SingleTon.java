package classAn;

public class SingleTon {
	
	//����ʽ
	private static SingleTon st=new SingleTon();
	
	public static SingleTon getInstance()
	{
		return SingleTon.st;
	}
	
	private SingleTon()
	{
		
	}
	
	public void  show()
	{
		System.out.println("�Ҿ���һ����ͨ�ķ���");
	}
	
	public static void main(String[] args)
	{
		SingleTon x = new SingleTon();
		x.show();
	}
}
