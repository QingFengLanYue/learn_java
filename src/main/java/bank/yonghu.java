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
		System.out.println("�û�ģ��˵�");
		System.out.println("1.���");
		System.out.println("2.ȡ��");
		System.out.println("3.��ѯ���˻���Ϣ");
		System.out.println("0.�˳�");
		System.out.print("��������һ���˻�id:");
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
					System.out.println("������˵��ţ�");
					Scanner s1=new Scanner(System.in);
					int n=s1.nextInt();
					if(n==1)
					{
						System.out.println("���������");
						Scanner s2=new Scanner(System.in);
						double m=s2.nextDouble();
						Double yue=rs.getDouble("jine")+m;
						String sql1="update kehu set jine=? where id=?";					
						ps1=conn.prepareStatement(sql1);
						ps1.setDouble(1,yue);
						ps1.setInt(2,i);
						ps1.executeUpdate();
						System.out.println(rs.getString("name")+"   �ɹ�����"+m+"Ԫ");
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
						System.out.println("������ȡ���");
						Scanner s2=new Scanner(System.in);
						double m=s2.nextInt();
						if(m>rs.getDouble("jine"))
						{
							System.out.println("����");
						}
						else
						{
							Double yue=rs.getDouble("jine")-m;
							String sql1="update kehu set jine=? where id=?";					
							ps1=conn.prepareStatement(sql1);
							ps1.setDouble(1,yue);
							ps1.setInt(2,i);
							ps1.executeUpdate();
							System.out.println(rs.getString("Name")+"�ɹ�ȡ��"+m+"Ԫ");
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
							System.out.println(rs3.getString("name")+"����Ϣ�ǣ�"+rs3.getDouble("jine")*rs3.getDouble("lilv")+"Ԫ");
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
					System.out.println("���˺Ų�����");
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
