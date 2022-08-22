package classAn;

public class test {

	public static void main(String args[]) {
/*		Car cc=new Car();
		cc.run();
		Plane pp=new Plane();
		pp.run();*/
		
		MoveTools mt=MoveToolsFactory.createTool("car");
		mt.run();
		
		MoveTools mt2=MoveToolsFactory.createTool("plane");
		mt2.run();
		
		MoveTools mt3=MoveToolsFactory.createTool("dapao");
		if(mt3!=null)
		{
			mt3.run();
		}

		
	}

}
