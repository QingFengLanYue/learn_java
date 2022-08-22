package classAn;

public class SingleTon {
	
	//饿汉式
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
		System.out.println("我就是一个普通的方法");
	}
	
	public static void main(String[] args)
	{
		SingleTon x = new SingleTon();
		x.show();
	}
}
