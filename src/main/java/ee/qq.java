package ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
public class qq{
	public static void main(String args [])
	{
		try {
			String sql="insert hehe into value (?,?,?,?,?,?)";
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			
			System.out.println("加载驱动");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/haha?user=root&password=123456");
			
			System.out.println("获取链接");
		
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "x");
			ps.setInt(2, 0);
			
			ps.executeUpdate();
			//PreparedStatement ps=conn.preparestatement(sql)
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
}
