
package test;
public class chengJibiao
	{
	public static void main(String args [])
		{
			int a=(int)(Math.random()*100+1);
				if(a>=90)
				System.out.println(a+"优秀");
				else if(a>=80)
				System.out.println(a+"良好");
				else if(a>=70)
				System.out.println(a+"不错");
				else if(a>=60)
				System.out.println(a+"及格");
				else
				System.out.println(a+"不及格");
	}        }
