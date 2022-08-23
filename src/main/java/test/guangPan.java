package test;
import java.util.Scanner;
public class guangPan
{ 
 public static void main(String [] args)
{       
	System.out.print("请输入购买数量;");
	Scanner a=new Scanner(System.in);
	int b=a.nextInt();
	if (b>=500)
	System.out.println("购买"+b+"张，总共"+b*3.5*0.85);
	else if (b>=400)
	System.out.println("购买"+b+"张，总共"+b*3.5*0.9);
	else if (b>=300)
	System.out.println("购买"+b+"张，总共"+b*3.5*0.92);
	else if (b>=200)
	System.out.println("购买"+b+"张，总共"+b*3.5*0.94);
	else if (b>=100)
	System.out.println("购买"+b+"张，总共"+b*3.5*0.95);
	else
	System.out.println("购买"+b+"张，总共"+b*3.5);

}	
}
