package test;
class li
	{
	private String name="zhangsan";
public void setName(String n){
	name=n;
	}
public void si()
		{
		System.out.println(name);
		}
	}
class lisi
	{
	public static void main (String args[])	
		{
		li a=new li();
		
		a.setName("lisi");
		a.si();
		}
	}