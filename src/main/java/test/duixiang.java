import java.util.Scanner;
class yuan
	{
	int banjing;
	public  void mianji()
		{
		double mj;
		mj=3.14*banjing*banjing;
		System.out.println("Բ�İ뾶Ϊ"+banjing+",���Ϊ"+mj);
		}
	public void zhouchang()
		{
		double zhouchang;
		zhouchang=2*3.14*banjing;
		System.out.println("Բ�İ뾶Ϊ"+banjing+",�ܳ�Ϊ"+zhouchang);
		}
	}
public class duixiang{
	public static void main(String args [])
		{
		yuan a=new yuan();
		System.out.print("������뾶");
		Scanner c=new Scanner(System.in);
		int b=c.nextInt();
		a.banjing=b;
		a.mianji();
		a.zhouchang();
		}	
	}