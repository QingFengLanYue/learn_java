package math��ҵ;

import java.util.Scanner;

public class math {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����");
		Scanner sc1=new Scanner(System.in);
		int x=sc1.nextInt();
		System.out.println("��������һ����");
		Scanner sc2=new Scanner(System.in);
		;int y=sc2.nextInt();
		System.out.println(Math.round(Math.cbrt(Math.max(Math.abs(x),Math.abs(y)))));
		}

}
