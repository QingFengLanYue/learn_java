package test;

import java.util.Scanner;

public class �ɼ������в� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n>=1;n++)
		{
			System.out.println("������ɼ�");
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
							System.out.println("������");
						}
						else if(x>60&x<70)
						{
							System.out.println("����");
						}
						else if(x>70&x<80)
						{
							System.out.println("һ��");
						}
						else if(x>80&x<90)
						{
							System.out.println("��");
						}
						else if(x>90)
						{
							System.out.println("����");
						}
						i=0;
						}
					}
				else 
				{
					System.out.println("����ɼ���Ч������������");
				}
			}
		}
	}
}



