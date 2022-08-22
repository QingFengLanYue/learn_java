package test;
import java.util.Scanner;
public class gongZi
{ 
 public static void main(String [] args)
{       
	System.out.print("请输入工资;");
	Scanner a=new Scanner(System.in);
	double b=a.nextInt();
	if (b>3500)
	System.out.println("工资"+b+"税后总共"+b*0.95);
	else
	System.out.println("工资"+b+"税后总共"+b);

}	
}
