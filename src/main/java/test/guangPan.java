package test;
import java.util.Scanner;
public class guangPan
{ 
 public static void main(String [] args)
{       
	System.out.print("�����빺������;");
	Scanner a=new Scanner(System.in);
	int b=a.nextInt();
	if (b>=500)
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5*0.85);
	else if (b>=400)
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5*0.9);
	else if (b>=300)
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5*0.92);
	else if (b>=200)
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5*0.94);
	else if (b>=100)
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5*0.95);
	else
	System.out.println("����"+b+"�ţ��ܹ�"+b*3.5);

}	
}
