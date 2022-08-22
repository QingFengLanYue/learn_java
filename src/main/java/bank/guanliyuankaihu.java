package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class guanliyuankaihu {
	public void kaihu()
	{
		Scanner s3=new Scanner(System.in);
		System.out.print("请输入开户户名：");
		String name=s3.next();
		System.out.print("请输入开户金额：");
		Scanner s4=new Scanner(System.in);
		Double jine=s4.nextDouble();
		System.out.print("请选择利息类型（1.固定利率 2.浮动利率）：");
		Scanner s5=new Scanner(System.in);
		int n=s5.nextInt();
		Double lilv;
		if(n==1)
		{
			lilv=0.03;
		}
		else
		{
			if(jine<=5000)
			{
				lilv=0.01;
			} 
			else if(jine>5000&&jine<=100000)
			{
				lilv=0.02;
			}
			else
			{
				lilv=0.05;
			}	
		}
		String sql1="insert into kehu values(?,?,?,?)";
		String sql2="select count(*) from kehu";
		Connection conn=null;
		PreparedStatement ps2=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			//System.out.println("加载驱动");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yinhang?user=root&password=123456");
			//System.out.println("获取连接");
			ps2=conn.prepareStatement(sql2);		 //统计已有id个数
			rs=ps2.executeQuery();
			int id=0;
			while(rs.next())
			{
				kehu kk=new kehu();
				id=rs.getInt("count(*)")+101;			//在已有id个数的基础上加1为开户者的id
			}						
			ps1=conn.prepareStatement(sql1);			
			ps1.setInt(1,id);
			ps1.setString(2,name);
			ps1.setDouble(3,jine);
			ps1.setDouble(4,lilv);
			ps1.executeUpdate();
			System.out.println("开户成功！！！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally 											
		{
			if(rs!=null)
				{try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			if(ps2!=null)//关闭连接
				{try {
					ps2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			if(ps1!=null)
				{try {
					ps1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			if(conn!=null)
				{try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			
		}
		
	}
}

