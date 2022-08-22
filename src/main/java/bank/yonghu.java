package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yonghu {
	
	public void denglu()
	{
		while(true)
		{
		System.out.println("用户模块菜单");
		System.out.println("1.存款");
		System.out.println("2.取款");
		System.out.println("3.查询本账户利息");
		System.out.println("0.退出");
		System.out.print("请先输入一个账户id:");
		Scanner d1=new Scanner(System.in);
		int i=d1.nextInt();
		String sql="select * from kehu where id=?";
		Connection conn=null;
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		PreparedStatement ps3=null;
		ResultSet rs=null;
		ResultSet rs2=null;
		ResultSet rs3=null;
		List <kehu>list=new ArrayList<kehu>();
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yinhang?user=root&password=123456");
			ps=conn.prepareStatement(sql);
			ps.setInt(1, i);
			rs=ps.executeQuery();
				if(rs.next())
				{
					kehu kh=new kehu();
					kh.setId(rs.getInt("id"));
					kh.setName(rs.getString("name"));
					kh.setJine(rs.getDouble("jine"));
					list.add(kh);
					for(kehu hh:list)
					{
						System.out.println(hh.getId()+"  "+hh.getName()+"  "+hh.getJine());
					}
					System.out.println("请输入菜单号：");
					Scanner s1=new Scanner(System.in);
					int n=s1.nextInt();
					if(n==1)
					{
						System.out.println("请输入存款金额：");
						Scanner s2=new Scanner(System.in);
						double m=s2.nextDouble();
						Double yue=rs.getDouble("jine")+m;
						String sql1="update kehu set jine=? where id=?";					
						ps1=conn.prepareStatement(sql1);
						ps1.setDouble(1,yue);
						ps1.setInt(2,i);
						ps1.executeUpdate();
						System.out.println(rs.getString("name")+"   成功存入"+m+"元");
						String sql2="select * from kehu where id=i";
						ps2=conn.prepareStatement(sql2);
						rs2=ps.executeQuery();
						while(rs2.next())
						{
							System.out.println(rs2.getInt("id")+" "+rs2.getString("name")+" "+rs2.getDouble("jine"));
						}
						break;
					}
					if(n==2)
					{
						System.out.println("请输入取款金额：");
						Scanner s2=new Scanner(System.in);
						double m=s2.nextInt();
						if(m>rs.getDouble("jine"))
						{
							System.out.println("余额不足");
						}
						else
						{
							Double yue=rs.getDouble("jine")-m;
							String sql1="update kehu set jine=? where id=?";					
							ps1=conn.prepareStatement(sql1);
							ps1.setDouble(1,yue);
							ps1.setInt(2,i);
							ps1.executeUpdate();
							System.out.println(rs.getString("Name")+"成功取出"+m+"元");
							String sql2="select * from kehu where id=i";
							ps2=conn.prepareStatement(sql2);
							rs2=ps.executeQuery();
							while(rs2.next())
							{
								System.out.println(rs2.getInt("id")+" "+rs2.getString("Name")+" "+rs2.getDouble("jine"));
							}
						}	
						break;
					}
					if(n==3)
					{
						String sql3="select * from kehu where id=?";
						ps3=conn.prepareStatement(sql3);
						ps3.setInt(1,i);
						rs3=ps3.executeQuery();
						while(rs3.next())
						{
							System.out.println(rs3.getString("name")+"的利息是："+rs3.getDouble("jine")*rs3.getDouble("lilv")+"元");
						}
						break;
					}
					if(n==0)
					{
						break;
					}
				}
				else
				{
					System.out.println("该账号不存在");
					break;
				}
				
		} catch (Exception e) {
			e.printStackTrace();
			} 
		finally{
				if(rs!=null)
				{
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
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
		}
	}
}
