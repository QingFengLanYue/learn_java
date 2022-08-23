package Runnable;


public class testR {

	public static void main(String[] args) {
		
		testThread tt=new testThread();
		//tt.run(); 即使你的类承继多线程类，如果你用  对象.run()多线程方法，它还是默认单线程
		
		testRunnable tr=new testRunnable();//创建实现Runnable接口，子类的的对象
		Thread ta=new Thread(tr);//构造一个Thread类，并在构造函数中把上一步的对象传入
		
		ta.start();//Thread类的对象 调用start()实现多线程方法
		tt.start();//你调用 start()  java底层会自动来调用 run()多线程方法,实现多线程
		
	/*	int i=0;
		while(i++ <5)
		{
			System.out.println("main "+Thread.currentThread().getName());
		}*/
	}
}
