package po;


	import java.io.File;
	import java.lang.reflect.Field;
	import java.lang.reflect.InvocationTargetException;
	import java.lang.reflect.Method;
	import java.sql.*;
	import java.util.*;

import po.person;



	public class qq {
		

		public List queryAll()
		{
			int i=1;
		while(true){
						String sql="insert into jj values(?,?,?,?)";
						List<person> list=new ArrayList<person>();
			try {
				Class.forName("org.gjt.mm.mysql.Driver").newInstance();
				//System.out.println(1);
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/haha?user=root&password=123456");
				//System.out.println(2);
				PreparedStatement ps=conn.prepareStatement(sql);
				//创建加载sql的对象,并加载sql
				
				i++;
				ps.setInt(1, i);
				double a;
				a=Math.random()*1000000;
				ps.setDouble(2, a);
				double a1;
				a1=Math.random()*1000000;
				ps.setDouble(3, a1);
				
				double a2;
				a2=Math.random()*1000000;
				ps.setDouble(4, a2);
				
		
				
				ps.executeUpdate();//执行sql操作，并返回结果集
				

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
	}
		public static void main(String[] args) {
			qq tt=new qq();
			tt.queryAll();
			
		}
	}

	
