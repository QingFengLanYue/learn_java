package test;

public class zhishu {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<100;i++)
		{
		for(int j=2;j<100;j++)
			{
				if (i!=j&&i%j==0)
					{
			
					break;
					//continue;
					}
				if(i==j&&i%j==0)
				{
					System.out.print(i+"\t");
				}
			}
		}
	}
}
