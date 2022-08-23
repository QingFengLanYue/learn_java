package bank;

import java.sql.*;
import java.util.*;

class guanliyuan {
	public void guanli()
	{
		while(true)
		{	
			System.out.println("管理员模块菜单");
			System.out.println("1. 开户");
			System.out.println("2. 查询所有账户");
			System.out.println("0. 退出 ");
			System.out.print("请输入菜单号：");
			Scanner s2=new Scanner(System.in);
			int i=s2.nextInt();
			if(i==1)										//开户
			{	
				guanliyuankaihu kk=new guanliyuankaihu();
				kk.kaihu();
			}
			else if(i==2)				//查询所有账户信息
			{
				guanliyuanchaxun cc=new guanliyuanchaxun();
				List <kehu>list=cc.chaxun();
				for(kehu hh:list)
				{
					System.out.println(hh.getId()+"  "+hh.getName()+"  "+hh.getJine());
				}	
			}
			else
			{
				break;
			}
	}
	}
}
