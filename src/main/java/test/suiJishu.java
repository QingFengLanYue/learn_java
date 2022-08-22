package test;
public class suiJishu
	{
	public static void main(String args [])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)

			{
			if(i!=j)
				{
				for(int m=1;m<=4;m++)
					{

					if(m!=j&&m!=i)
						{
						for(int n=1;n<=4;n++)
							{
							if(n!=i&&n!=j&&n!=m)
							{									System.out.println(i*1000+j*100+m*10+n);
							}			
							}
						}
					}	
				}
			}
		}
	}	



	}