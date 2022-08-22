package test;
public class yuanSuan
	{	
		public static void main(String args [])
		{
			int x=9, y=3;
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
			System.out.println(x<y?x+y:(x-y)>2?x*y:y/x);
		}
	}