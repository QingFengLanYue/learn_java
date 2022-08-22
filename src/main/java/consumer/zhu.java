package consumer;

public class zhu {

	
	public static void main(String[] args) {
		Ck ck=new Ck();
		xfz Xfz=new xfz(ck);
		scz Scz=new scz(ck);
		Xfz.start();
		Scz.start();
	}

}
