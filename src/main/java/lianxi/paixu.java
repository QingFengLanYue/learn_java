package lianxi;

public class paixu {

	public static void main(String[] args) {
		int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
		int t = 0;
	for(int i=1;i<x.length;i++)
	{
		for(int j=0;j<x.length-1;j++)
		{
			if(x[j]>x[j+1])
			{
				t=x[j];
				x[j]=x[j+1];
				x[j+1]=t;
			}
		}
	}
	for (int m= 0; m < x.length; m++) {

		System.out.print(x[m] + " ");
	}
	}
 }

