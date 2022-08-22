package test;
public class kongxin
	{
		public static void main(String args[])
		{
			for(int i=1;i<=51;i++)
			{  
				if(i<=26)
				{
					for(int j=1;j<=26-i;j++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
					for(int k=1;k<=2*i-3;k++)
				
					{
						System.out.print(" ");	
					}
					if(i>1)
					System.out.print("*");	
					}	
				
			    else
				{
					for(int m=1;m<=i-26;m++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
					for(int n=1;n<=101-2*i;n++)
					{
						System.out.print(" ");	
					}
					if(i<51)
					System.out.print("*");
				}
					
			System.out.println();
			}
		}
	}
