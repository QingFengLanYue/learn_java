package Runnable;


public class testR {

	public static void main(String[] args) {
		
		testThread tt=new testThread();
		//tt.run(); ��ʹ�����м̶��߳��࣬�������  ����.run()���̷߳�����������Ĭ�ϵ��߳�
		
		testRunnable tr=new testRunnable();//����ʵ��Runnable�ӿڣ�����ĵĶ���
		Thread ta=new Thread(tr);//����һ��Thread�࣬���ڹ��캯���а���һ���Ķ�����
		
		ta.start();//Thread��Ķ��� ����start()ʵ�ֶ��̷߳���
		tt.start();//����� start()  java�ײ���Զ������� run()���̷߳���,ʵ�ֶ��߳�
		
	/*	int i=0;
		while(i++ <5)
		{
			System.out.println("main "+Thread.currentThread().getName());
		}*/
	}
}
