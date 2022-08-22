package test;
class ji
{
	public static void main (String[]args)
	{
		int i,s,m;
		s=1;
		for(i=2;i<10;i++)
		{	
			m=s;
			s=s*i;
			System.out.println(m+"*"+i+"="+s);
		}
	}
}