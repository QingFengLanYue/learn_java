package producter;

public class sx {

	public static void main(String[] args) {
		Ck ck=new Ck();
		
		Scz scz=new Scz(ck);
		Xfz xfz=new Xfz(ck);
		
		scz.start();
		xfz.start();
	}

}
