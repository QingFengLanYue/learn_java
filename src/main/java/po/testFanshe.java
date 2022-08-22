package po;

import java.lang.reflect.*;

import java.sql.*;

import java.util.*;
import po.nimei;


public class testFanshe {

	public List queryAll(Class clazz)
	{
					String sql="select * from "+clazz.getSimpleName();
					List list=new ArrayList();
					Object obj=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/haha?user=root&password=123456");
			PreparedStatement ps=conn.prepareStatement(sql);//创建加载sql的对象,并加载sql
			ResultSet rs=ps.executeQuery();//执行sql操作，并返回结果集
			while(rs.next())
			{
				/*person pp=new person();
				pp.setUsername(rs.getString("username"));
				pp.setPassword(rs.getString("password"));		
				list.add(pp);*/
				obj=clazz.newInstance();
				
				Field [] ff=clazz.getDeclaredFields();
				for(Field f:ff)
				{
					String fName=f.getName();
					String mName="set"+fName.substring(0,1).toUpperCase()+fName.substring(1);
					Method me=clazz.getMethod(mName, java.lang.String.class);
					me.invoke(obj, rs.getString(fName));
				}
				list.add(obj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return list;
	}
	
	public static void main(String[] args) {
		testFanshe tt=new testFanshe();
		try {
		/*	Class clazz=Class.forName("po.person");
			List<person> list=tt.queryAll(clazz);
			for(person pp:list)
			{
				System.out.println(pp.getUsername()+"  "+pp.getPassword());
			}*/
			
			
			Class clazz=Class.forName("po.person");
			List<person> list=tt.queryAll(clazz);
			for(person pp:list)
			{
				System.out.println(pp.getUsername()+"   "+pp.getPassword());
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
