package test;
class zhang
	 {
	String name;
	int age;
	zhang()
		{
		System.out.println("name"+name+"age"+age);
		}
	zhang(String n)
		{
		name=n;
		System.out.println("name"+name+"age"+age);
		}
	zhang(String n,int a)
		{
		name=n;
		age=a;
		System.out.println("name"+name+"age"+age);
		}

	}
public class zhangsan
	{
	 public static void main(String[] args)
		{
		zhang q=new zhang();
		zhang q1=new zhang("zhangsan");
		zhang q2=new zhang("lisi",55);
		zhang q3=new zhang("wangwu");
		}
	
	}