package test;
import java.util.Scanner;
public class yingHang
	{
	public static void main(String args [])
		{
		int x=3;
		int m,n;
		do{
			System.out.print("欢迎登陆银行系统");
			System.out.print("请输入你的账号：");
			Scanner a=new Scanner(System.in);
			n=a.nextInt();
			System.out.print("请输入你的密码：");
			Scanner b=new Scanner(System.in);
			 m=b.nextInt();
			if(n==20149011 && m==502059)
			{  
			System.out.print("输入正确，欢迎使用");
			break;
			  }
			else
			System.out.println("输入账号或密码错误，你还有"+(x-1)+"次机会，请重新输入");
			x--;
			if(x==0){
			System.out.print("输入错误，已经输错三次，账号被锁定");	
			break;	
				}
		}while(n!=20149011 || m!=502059);
		
		}

	}