package test;

public class ���� {
/**
 * ȡ�����0�����������һ������������������������������ˣ�
 * �����Ƿ�����
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
		System.out.println("����"+k+"������");
	}
}