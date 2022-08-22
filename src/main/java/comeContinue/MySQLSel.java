package comeContinue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class MySQLSel {
    public static ArrayList<String> Select(String id) {
        ArrayList<String> stu = new ArrayList<String>();
        Connection con;//声明一个连接对象
        //遍历查询结果集
        try {
            con = MySQLconnection.getConnection();//1.调用方法返回连接
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement statement = con.createStatement(); //2.创建statement类对象，用来执行SQL语句！！
            String sql = "SELECT * FROM cs_03 WHERE id = %s";//要执行的SQL语句
            ResultSet rs = statement.executeQuery(String.format(sql,id));
            while(rs.next()){
                stu.add(rs.getString("id").trim());
                stu.add(rs.getString("name").trim());
            }
            MySQLconnection.close(rs);
            MySQLconnection.close(statement);
            MySQLconnection.close(con);
            return stu;
        }	catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return stu;
    }
    public static void main(String[] args) {
        System.out.println(Select("123"));
    }
}