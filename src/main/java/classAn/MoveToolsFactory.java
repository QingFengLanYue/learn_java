package classAn;
public class MoveToolsFactory {
	public static MoveTools createTool(String type) {
		// ²Ù×÷1
		// ²Ù×÷2
		// ¡£
		// ¡£
		// ²Ù×÷10
		if (type.equals("car")) {
			return new Car();
		} 
		
		if(type.equals("plane")) {
			return new Plane();
		}
		return null;
	}
}
