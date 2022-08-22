package classAn;
public class MoveToolsFactory {
	public static MoveTools createTool(String type) {
		// ����1
		// ����2
		// ��
		// ��
		// ����10
		if (type.equals("car")) {
			return new Car();
		} 
		
		if(type.equals("plane")) {
			return new Plane();
		}
		return null;
	}
}
