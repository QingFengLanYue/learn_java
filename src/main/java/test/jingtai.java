package test;
class weibu
	{
	int a=1;
	private int b=2;
	static int c=3;
	public void show()
		{
		System.out.println(a+"�����ⲿ��show����");
		}
	
	class naibu
		{
		int d=4;
		int e=5;
		int f=6;
		public void view()
			{
			System.out.println("�����ڲ���view����");
			System.out.println(a+"�����ⲿ��A��show����");
			System.out.println(b+"�����ⲿ��B��show����");
			System.out.println(c+"�����ⲿ��c�ľ�̬��������");
			}
		}
	public static class naibu2
		{
		static int h=8;
		public void view2()
			{
			System.out.println("���Ǿ�̬�ڲ����view2����");
			}
	
		}
	public void show2()
		{
		class naibu3
			{
			public void view3()
				{
				System.out.println("����show2�����е��ڲ����view3�ķ���");
				}
			}
		naibu3 nn=new naibu3();
		nn.view3();
			
		}
	}

public class jingtai {

	
	public static void main(String[] args) {
	System.out.println("*******8�ⲿ��ĳ�Ա���*******");
	weibu w=new weibu();
	w.show();
	System.out.println("*******�ڲ���ĳ�Ա���*******");
	weibu.naibu n=new weibu().new naibu();
	n.view();
	System.out.println("*******��̬�ڲ���ĳ�Ա���*******");
	weibu.naibu2 n2=new weibu.naibu2();
	n2.view2();
	System.out.println("*******�����ڲ���ĳ�Ա���*******");
	w.show2();
	}
}

