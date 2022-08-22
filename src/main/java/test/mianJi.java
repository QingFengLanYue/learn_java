package test;
import java.util.Scanner;
public class mianJi
	{
	public static void main(String args [])
		{
		System.out.println("请选择图形类型：");
		System.out.println("1:长方形");
		System.out.println(" 2:圆形 ");
		System.out.println(" 3:三角形 ");
		System.out.print("请输入选项：");
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if(b==1)
		{
			System.out.print("你选的长方形，请输入长：");
			Scanner a1=new Scanner(System.in);
			int b1=a1.nextInt();
			System.out.print("请输入宽：");	
			Scanner a2=new Scanner(System.in);
			int b2=a2.nextInt();
			System.out.println("长方形的面积为"+b1*b2);
		}
		else if(b==2)
			{
			System.out.print("你选的圆，请输入半径：");	
			Scanner a3=new Scanner(System.in);
			int b3=a3.nextInt();
			System.out.println("圆的面积为"+b3*b3*3.14);
			}
		else if(b==3)
			{
			System.out.print("你选的三角形，请输入底：");	
			Scanner a4=new Scanner(System.in);
			int b4=a4.nextInt();

			System.out.print("请输入高：");	
			Scanner a5=new Scanner(System.in);
			int b5=a5.nextInt();
			System.out.println("三角形的面积为"+b5*b4*0.5);
			}
	
		}		
	}