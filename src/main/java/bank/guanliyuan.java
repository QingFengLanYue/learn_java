package bank;

import java.sql.*;
import java.util.*;

class guanliyuan {
	public void guanli()
	{
		while(true)
		{	
			System.out.println("����Աģ��˵�");
			System.out.println("1. ����");
			System.out.println("2. ��ѯ�����˻�");
			System.out.println("0. �˳� ");
			System.out.print("������˵��ţ�");
			Scanner s2=new Scanner(System.in);
			int i=s2.nextInt();
			if(i==1)										//����
			{	
				guanliyuankaihu kk=new guanliyuankaihu();
				kk.kaihu();
			}
			else if(i==2)				//��ѯ�����˻���Ϣ
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
