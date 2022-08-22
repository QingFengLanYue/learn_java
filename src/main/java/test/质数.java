package test;

public class 质数 {
/**
 * 取余等于0有两种情况，一种是这个数是质数，它被本身整除了，
 * 或者是非素数
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int k=0;
		for(n=101;n<=200;n++)
		{
			int i=2;
			int m=1;
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					if(i==n)
					{
						
						System.out.println(i);
						k++;
					}
					else
					{
						i=n+1;
					}
				
				
				}	
			}
		}
		System.out.println("共有"+k+"个素数");
	}
}