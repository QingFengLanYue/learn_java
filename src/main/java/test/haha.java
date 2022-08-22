package test;

public class haha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<100;i++)
		{
			for(int j=2;j<100;j++)
			{
				if(i%j==0&&i!=j)
					break;
				if(i%j==0&&i==j)
				{				
					System.out.print(i+" ");
				}
			
			}
		}
		
	}

}
