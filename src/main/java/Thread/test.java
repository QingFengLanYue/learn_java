package Thread;

import java.io.*;


public class test {

	public static void main(String[] args) {
		
		testThread tt=new testThread();
		//tt.run(); ��ʹ�����м̶��߳��࣬�������  ����.run()���̷߳�����������Ĭ�ϵ��߳�
		tt.start();//����� start()  java�ײ���Զ������� run()���̷߳���,ʵ�ֶ��߳�
		
		
		int i=0;
		while(i++ <5)
		{
			System.out.println("main "+Thread.currentThread().getName());
		}
	}
}
