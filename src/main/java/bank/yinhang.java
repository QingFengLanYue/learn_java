package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yinhang {

	public static void main(String[] args) {
		
		while (true){
		System.out.println("################################");	
		System.out.println("��ѡ�� 1-����Ա     2-�û�     0-�˳�");
		Scanner s1=new Scanner(System.in);
		int i=s1.nextInt();
		if(i==1)
		{
			guanliyuan gg=new guanliyuan();
			gg.guanli();
		}
		if(i==2)
		{
			yonghu yy=new yonghu();
			yy.denglu();
			
			
		}
		if(i==0)
		{
			break;
		}
	}

}
}