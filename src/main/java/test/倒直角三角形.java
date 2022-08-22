package test;
class sj
{ 
 public static void main(String [] args)
{       
	int i;
 	for(i=0;i<10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		
		for(int k=1;k<=10-i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
}
}
}

