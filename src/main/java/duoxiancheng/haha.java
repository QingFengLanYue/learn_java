package duoxiancheng;

public class haha {

	
	public static  synchronized void main(String[] args) {
		aas a=new aas();
		bbb b=new bbb();
		Thread bb=new Thread(b);
		bb.start();
		a.start();
		//a.run();
		//b.run();
	}

}
