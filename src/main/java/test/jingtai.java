package test;
class weibu
	{
	int a=1;
	private int b=2;
	static int c=3;
	public void show()
		{
		System.out.println(a+"这是外部类show方法");
		}
	
	class naibu
		{
		int d=4;
		int e=5;
		int f=6;
		public void view()
			{
			System.out.println("这是内部类view方法");
			System.out.println(a+"这是外部类A的show方法");
			System.out.println(b+"这是外部类B的show方法");
			System.out.println(c+"这是外部类c的静态变量方法");
			}
		}
	public static class naibu2
		{
		static int h=8;
		public void view2()
			{
			System.out.println("这是静态内部类的view2方法");
			}
	
		}
	public void show2()
		{
		class naibu3
			{
			public void view3()
				{
				System.out.println("这是show2方法中的内部类的view3的方法");
				}
			}
		naibu3 nn=new naibu3();
		nn.view3();
			
		}
	}

public class jingtai {

	
	public static void main(String[] args) {
	System.out.println("*******8外部类的成员输出*******");
	weibu w=new weibu();
	w.show();
	System.out.println("*******内部类的成员输出*******");
	weibu.naibu n=new weibu().new naibu();
	n.view();
	System.out.println("*******静态内部类的成员输出*******");
	weibu.naibu2 n2=new weibu.naibu2();
	n2.view2();
	System.out.println("*******方法内部类的成员输出*******");
	w.show2();
	}
}

