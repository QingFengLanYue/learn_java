package test;

public class 菱形 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=6;i<=9;i++)
		{
			for(j=1;j<=i-4;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=19-2*i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	} 

}
