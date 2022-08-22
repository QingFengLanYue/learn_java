package test;

import java.util.Scanner;

public class 闰年 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份");
		Scanner sc1=new Scanner(System.in);
		int i=sc1.nextInt();
		if(i%4==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
