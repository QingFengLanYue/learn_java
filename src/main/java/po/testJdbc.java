package po;

import java.sql.*;
import java.util.*;


public class testJdbc {

	public List queryAll()
	{
					String sql="select * from person";
					List<poPerson> list=new ArrayList<>();
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			//System.out.println(1);
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/haha?user=root&password=123456");
			//System.out.println(2);
			PreparedStatement ps=conn.prepareStatement(sql);//创建加载sql的对象,并加载sql
			ResultSet rs=ps.executeQuery();//执行sql操作，并返回结果集
			while(rs.next())
			{
				poPerson pp=new poPerson();
				pp.setUsername(rs.getString("username"));
				pp.setPassword(rs.getString("password"));		
				list.add(pp);
			}

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		testJdbc tt=new testJdbc();
		List<poPerson> list=tt.queryAll();
		for(poPerson pp:list)
		{
			System.out.println(pp.getUsername()+"  "+pp.getPassword());
		}
	}
	
	
}
