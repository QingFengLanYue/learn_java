package test;
import java.util.Scanner;
public class yingHang
	{
	public static void main(String args [])
		{
		int x=3;
		int m,n;
		do{
			System.out.print("��ӭ��½����ϵͳ");
			System.out.print("����������˺ţ�");
			Scanner a=new Scanner(System.in);
			n=a.nextInt();
			System.out.print("������������룺");
			Scanner b=new Scanner(System.in);
			 m=b.nextInt();
			if(n==20149011 && m==502059)
			{  
			System.out.print("������ȷ����ӭʹ��");
			break;
			  }
			else
			System.out.println("�����˺Ż���������㻹��"+(x-1)+"�λ��ᣬ����������");
			x--;
			if(x==0){
			System.out.print("��������Ѿ�������Σ��˺ű�����");	
			break;	
				}
		}while(n!=20149011 || m!=502059);
		
		}

	}