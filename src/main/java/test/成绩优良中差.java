package test;

import java.util.Scanner;

public class 成绩优良中差 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n>=1;n++)
		{
			System.out.println("请输入成绩");
			for(int i=1;i>=1;)
			{
				Scanner sc1=new Scanner(System.in);
				int x=sc1.nextInt();
				if(x>=0&x<=100)	
				{
					if(x>=0&&x<=100)
					{
						if(x<=60)
						{
							System.out.println("不及格");
						}
						else if(x>60&x<70)
						{
							System.out.println("及格");
						}
						else if(x>70&x<80)
						{
							System.out.println("一般");
						}
						else if(x>80&x<90)
						{
							System.out.println("良");
						}
						else if(x>90)
						{
							System.out.println("优秀");
						}
						i=0;
						}
					}
				else 
				{
					System.out.println("输入成绩无效，请重新输入");
				}
			}
		}
	}
}



