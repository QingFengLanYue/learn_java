package test;
import java.util.Scanner;
public class mianJi
	{
	public static void main(String args [])
		{
		System.out.println("��ѡ��ͼ�����ͣ�");
		System.out.println("1:������");
		System.out.println(" 2:Բ�� ");
		System.out.println(" 3:������ ");
		System.out.print("������ѡ�");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if(b==1)
		{
			System.out.print("��ѡ�ĳ����Σ������볤��");
			Scanner a1=new Scanner(System.in);
			int b1=a1.nextInt();
			System.out.print("�������");	
			Scanner a2=new Scanner(System.in);
			int b2=a2.nextInt();
			System.out.println("�����ε����Ϊ"+b1*b2);
		}
		else if(b==2)
			{
			System.out.print("��ѡ��Բ��������뾶��");	
			Scanner a3=new Scanner(System.in);
			int b3=a3.nextInt();
			System.out.println("Բ�����Ϊ"+b3*b3*3.14);
			}
		else if(b==3)
			{
			System.out.print("��ѡ�������Σ�������ף�");	
			Scanner a4=new Scanner(System.in);
			int b4=a4.nextInt();

			System.out.print("������ߣ�");	
			Scanner a5=new Scanner(System.in);
			int b5=a5.nextInt();
			System.out.println("�����ε����Ϊ"+b5*b4*0.5);
			}
	
		}		
	}