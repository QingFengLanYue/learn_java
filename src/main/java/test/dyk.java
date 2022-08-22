package test;
class dyk
{
 	public static void main (String args[])
	{
  		int i,j,k;
			
  		for(i=1;i<=10;i++)
			{	
				for(j=1;j<=10-i;j++)
 					{	
						System.out.print(" ");
					}
				if(i>1)
					{
						System.out.print("*");
					}
				for(k=1;k<2*i-2;k++)
					{
						if(i<10)	
						 	{	
								System.out.print(" ");
							}
						else
							{
								System.out.print("*");}
							}
		
				System.out.println("*");
			}	
	}
}