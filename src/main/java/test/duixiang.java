package test;
import java.util.Scanner;
class yuan
{
	int banjing;
	public  void mianji()
	{
		double mj;
		mj=3.14*banjing*banjing;
		System.out.println("圆的半径为"+banjing+",面积为"+mj);
	}
	public void zhouchang()
	{
		double zhouchang;
		zhouchang=2*3.14*banjing;
		System.out.println("圆的半径为"+banjing+",周长为"+zhouchang);
	}
}
public class duixiang{
	public static void main(String args [])
	{
		yuan a=new yuan();
		System.out.print("请输入半径");
		Scanner c=new Scanner(System.in);
		int b=c.nextInt();
		a.banjing=b;
		a.mianji();
		a.zhouchang();
	}
}