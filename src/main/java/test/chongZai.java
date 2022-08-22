package test;
class abc
	{
	public void bcd(int age)
		{	
		System.out.println(age);
		}
	public void bcd(String name)	
		{
		System.out.println(name);
		}
	}
public class chongZai
	{
	public static void main(String args[])   		{
		abc x=new abc();
		x.bcd(11);
		x.bcd("#########");
		}
	}