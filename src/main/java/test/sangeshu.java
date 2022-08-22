package test;

public class sangeshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				for(int m=1;m<=4;m++)
				{
						
						if(i!=j&&i!=m&&j!=m)
						{
							System.out.print(i*100+j*10+m*1+" ");
							
						}
						
				}
			}
		}
	}

}
