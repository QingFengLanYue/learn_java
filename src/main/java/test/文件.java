package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class �ļ� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ļ������ƣ�");
		Scanner sc1=new Scanner(System.in);
		String a=sc1.next();
		File b=new File("\\E:\\"+a);
		if(b.exists()==true)
		{
			System.out.println(a+"�ļ����Ѵ���");
		}
		else
		{
			b.mkdir();
			System.out.println("����"+a+"�������ļ������ƣ�");
			Scanner sc2=new Scanner(System.in);
			String a1=sc2.next();
			File b1=new File("\\E:\\"+a+"\\"+a1);
			b1.mkdir();
			
			System.out.println("����"+a1+"�ļ����������һ��txt�ļ�����");
			Scanner sc3=new Scanner(System.in);
			String a2=sc3.next();
			File b2=new File("\\E:\\"+a+"\\"+a1+"\\"+a2);
				
			try {
					b2.createNewFile();
				} catch (IOException e) {
						// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
			System.out.println("����"+a1+"�ļ���������ڶ���txt�ļ�����");
			Scanner sc4=new Scanner(System.in);
			String a3=sc4.next();
			File b3=new File("\\E:\\"+a+"\\"+a1+"\\"+a3);
			if(b3.exists()==true)
			{
					System.out.println(a2+"�ļ��Ѵ���");
			}
			else
			{
				try {
						b3.createNewFile();
					} catch (IOException e) {
							// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("����"+a1+"�ļ���������������ļ�������");
				Scanner sc5=new Scanner(System.in);
				String a4=sc5.next();
				File b4=new File("\\E:\\"+a+"\\"+a1+"\\"+a4);
				b4.mkdir();
							
				System.out.println("�޸�ǰ���ļ����ƣ�");
				String [] s=b1.list();
				for(int i=0;i<s.length;i++)
						{
							System.out.println((s[i]));
						}
				System.out.println("������һ���ļ�����ȥ�滻"+a3+"���ļ����ƣ�");
				Scanner sc6=new Scanner(System.in);
				String a5=sc6.next();
				b3.renameTo(new File("\\E:\\"+a+"\\"+a1+"\\"+a5));
				b3.setReadOnly();
				System.out.println("�޸ĺ���ļ����ƣ�");
				String [] s1=b1.list();
				for(int j=0;j<s1.length;j++)
					{   
						System.out.println((s1[j]));
					}
						
			}
					
		}
	}
}
		
	

	

