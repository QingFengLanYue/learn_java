package bank;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.math.BigInteger;
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
		String sql1="insert into kehu(card_no,name,jine,lilv) values(?,?,?,?)";
		String sql2="select max(id) from kehu";
		Connection conn=null;
		PreparedStatement ps2=null;
		ResultSet rs=null;
		PreparedStatement ps1=null;
		try {
//			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
//			//System.out.println("加载驱动");
//			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yinhang?user=root&password=123456");
			//System.out.println("获取连接");
			conn = JdbcUtil.getConnection();
			ps2=conn.prepareStatement(sql2);		 //统计已有id个数
			rs=ps2.executeQuery();
			BigInteger cardNo = null;
			while(rs.next())
			{
//				kehu kk=new kehu();
				BigInteger bi1 = new BigInteger("60000000001");
				int x = rs.getInt("max(id)");            //在已有id个数的基础上加1为开户者的id
				BigInteger bi2 = new BigInteger(String.valueOf(x));
				cardNo=bi2.add(bi1);
			}
			ps1=conn.prepareStatement(sql1);			
			ps1.setBigDecimal(1, BigDecimal.valueOf(Long.parseLong(String.valueOf(cardNo))));
			ps1.setString(2,name);
			ps1.setDouble(3,jine);
			ps1.setDouble(4,lilv);
			ps1.executeUpdate();
			System.out.println("开户成功！！！,卡号为: "+cardNo);
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

