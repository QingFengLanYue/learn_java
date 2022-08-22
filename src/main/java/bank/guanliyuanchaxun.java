package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class guanliyuanchaxun {
	public List chaxun()
	{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql2="select * from kehu";
		List <kehu>list=new ArrayList<kehu>();
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yinhang?user=root&password=123456");
			ps=conn.prepareStatement(sql2);
			rs=ps.executeQuery();
			while(rs.next())
			{
				kehu kh=new kehu();
				kh.setId(rs.getInt("id"));
				kh.setName(rs.getString("name"));
				kh.setJine(rs.getDouble("jine"));
				list.add(kh);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally{
			if(rs!=null)
				{try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			if(ps!=null)
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		return list;
	}
}


