package nimei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class niemi {
	public static void main(String[] args) {
		niemi dd=new niemi();
		
		dd.insert();
			}
/*public void insert(){
	try {
		String sql="insert into aaa value(?,?)";
		Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		System.out.println("加载驱动");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/haha?user=root&password=123456");
		System.out.println("获取连接");
		PreparedStatement ps=conn.prepareStatement(sql);//创建加载SQL的对象
		ps.setString(1, "haha");
		ps.setInt(2, 123);
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}*/
public void insert(){
	try {
		String sql="update aaa set name=? where age=?";
		Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		System.out.println("加载驱动");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/haha?user=root&password=123456");
		System.out.println("获取连接");
		PreparedStatement ps=conn.prepareStatement(sql);//创建加载SQL的对象
		ps.setString(1, "qq");
		ps.setInt(2, 123);
		ps.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
	




