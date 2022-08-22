package test;
class 三个数字比大小
{
	public static void main (String[]args)
	{
		int x=4;
		int y=5;
		int z=3;
		if(x>y)
		{
			if(x>z)
			{
				System.out.print("x");
			}
			else
			{
				System.out.print("z");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.print("y");
			}
			else
			{
				System.out.print("z");
			}
		}
	}
}