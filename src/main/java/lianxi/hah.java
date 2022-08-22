package lianxi;

public class hah {
	public static void main(String[] args) {
int x[] = { 12, 9, 45, 2, 13, 27, 48, 79, 56, 38 };
		for(int i=0;i<x.length;i++)
		{
			int min=x[i];
			int t=i;
			for(int j=i+1;j<x.length;j++)
			{
				if(min>x[j])
				{
					min=x[j];
					t=j;
				}
			}
			x[t]=x[i];
			x[i]=min;
		}
		for (int m=0;m<x.length;m++) {

			System.out.print(x[m] + " ");
		}
	}

}
