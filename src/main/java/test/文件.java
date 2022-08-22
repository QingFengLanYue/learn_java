package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 文件 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入文件夹名称：");
		Scanner sc1=new Scanner(System.in);
		String a=sc1.next();
		File b=new File("\\E:\\"+a);
		if(b.exists()==true)
		{
			System.out.println(a+"文件夹已存在");
		}
		else
		{
			b.mkdir();
			System.out.println("请在"+a+"输入子文件夹名称：");
			Scanner sc2=new Scanner(System.in);
			String a1=sc2.next();
			File b1=new File("\\E:\\"+a+"\\"+a1);
			b1.mkdir();
			
			System.out.println("请在"+a1+"文件夹下输入第一个txt文件名称");
			Scanner sc3=new Scanner(System.in);
			String a2=sc3.next();
			File b2=new File("\\E:\\"+a+"\\"+a1+"\\"+a2);
				
			try {
					b2.createNewFile();
				} catch (IOException e) {
						// TODO Auto-generated catch block
				e.printStackTrace();
				}
				
			System.out.println("请在"+a1+"文件夹下输入第二个txt文件名称");
			Scanner sc4=new Scanner(System.in);
			String a3=sc4.next();
			File b3=new File("\\E:\\"+a+"\\"+a1+"\\"+a3);
			if(b3.exists()==true)
			{
					System.out.println(a2+"文件已存在");
			}
			else
			{
				try {
						b3.createNewFile();
					} catch (IOException e) {
							// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("请在"+a1+"文件夹下输入第三个文件夹名称");
				Scanner sc5=new Scanner(System.in);
				String a4=sc5.next();
				File b4=new File("\\E:\\"+a+"\\"+a1+"\\"+a4);
				b4.mkdir();
							
				System.out.println("修改前的文件名称：");
				String [] s=b1.list();
				for(int i=0;i<s.length;i++)
						{
							System.out.println((s[i]));
						}
				System.out.println("请输入一个文件名称去替换"+a3+"的文件名称：");
				Scanner sc6=new Scanner(System.in);
				String a5=sc6.next();
				b3.renameTo(new File("\\E:\\"+a+"\\"+a1+"\\"+a5));
				b3.setReadOnly();
				System.out.println("修改后的文件名称：");
				String [] s1=b1.list();
				for(int j=0;j<s1.length;j++)
					{   
						System.out.println((s1[j]));
					}
						
			}
					
		}
	}
}
		
	

	

