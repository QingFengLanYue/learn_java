//导入包
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.lang.ref.SoftReference;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * 数据库连接
 */
public class cs01 {
    public static void main(String[] args) {
        Connection con;
        //jdbc驱动
        String driver="com.mysql.cj.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/test?&useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="root";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            String sql;
            sql="select * from cs_01";
            ResultSet ret= stmt.executeQuery(sql);
            while (ret.next()){
//                String a="ot";
//                String b="st";
//                String c=(b=="ot")?"Y":"N";
//                System.out.println("c:"+c);

                String recordtype=ret.getString("record_type");
                String trxdate =ret.getString("trx_date");
                String name=ret.getString("name");
                String id=ret.getString("id");
                String detial=ret.getString("detial");

                String recordtypelms=(recordtype.equals("OT"))?"Y":"N";



                //String in_sql;
                //in_sql="replace into table test.cs_02 values("+"\'id\'"+","+"\'name\'"+","+"\'detial\'"+");";
                //System.out.println("inset sql:"+in_sql);
                JSONObject jsonObj = new JSONObject();
                Map<String, String> buyiyang = new HashMap<String, String>();
                buyiyang.put("id", id);
                buyiyang.put("name", name);
                buyiyang.put("detial", null);
                buyiyang.put("trx_date", trxdate);
                jsonObj.put("buyiyang", buyiyang);

                Map<String, String> buyiyang2 = new HashMap<String, String>();
                buyiyang2.put("id", id);
                buyiyang2.put("name", name);
                buyiyang2.put("detial", null);
                buyiyang2.put("trx_date", trxdate);
                jsonObj.put("buyiyang2", buyiyang2);

                System.out.println("id:"+id);
                System.out.println("name:"+name);
                System.out.println("detial:"+detial);
                System.out.println("record_type:"+recordtypelms);
                System.out.println("trx_date:"+trxdate);
                System.out.println("detial:"+jsonObj);


            }

            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }

    }
}