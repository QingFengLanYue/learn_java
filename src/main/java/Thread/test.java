package Thread;

import java.io.*;


public class test {

	public static void main(String[] args) {
		
		testThread tt=new testThread();
		//tt.run(); 即使你的类承继多线程类，如果你用  对象.run()多线程方法，它还是默认单线程
		tt.start();//你调用 start()  java底层会自动来调用 run()多线程方法,实现多线程
		
		
		int i=0;
		while(i++ <5)
		{
			System.out.println("main "+Thread.currentThread().getName());
		}
	}
}
