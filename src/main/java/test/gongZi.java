package test;
import java.util.Scanner;
public class gongZi
{ 
 public static void main(String [] args)
{       
	System.out.print("�����빤��;");
	Scanner a=new Scanner(System.in);
	double b=a.nextInt();
	if (b>3500)
	System.out.println("����"+b+"˰���ܹ�"+b*0.95);
	else
	System.out.println("����"+b+"˰���ܹ�"+b);

}	
}
