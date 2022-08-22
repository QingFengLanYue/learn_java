package classAn;
public class MoveToolsFactory {
	public static MoveTools createTool(String type) {
		// 操作1
		// 操作2
		// 。
		// 。
		// 操作10
		if (type.equals("car")) {
			return new Car();
		} 
		
		if(type.equals("plane")) {
			return new Plane();
		}
		return null;
	}
}
