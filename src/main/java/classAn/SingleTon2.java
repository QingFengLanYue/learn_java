package classAn;

public class SingleTon2 {
	
	//懒汉式
	private static SingleTon2 st=null;
	
	public static SingleTon2 getInstance()
	{
		if(SingleTon2.st==null)
		{
			SingleTon2.st=new SingleTon2();
			return SingleTon2.st;
		}
		return SingleTon2.st;
	}
	
	private SingleTon2()
	{
		
	}
	
	public void  show()
	{
		System.out.println("我就是一个普通的方法");
	}
	public static void main(String[] args)
	{
		SingleTon2 ss2=SingleTon2.getInstance();
		SingleTon2 ss3=SingleTon2.getInstance();
		SingleTon2 ss4=SingleTon2.getInstance();
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);
	}
}
