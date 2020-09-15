
import java.sql.Connection;
import java.sql.Statement;


public class MySQLUpd {
    public static void Update(String[] stuinfo) {
        Connection con;//声明一个连接对象
        //遍历查询结果集
        try {
            con = MySQLconnection.getConnection();//1.调用方法返回连接
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement statement = con.createStatement(); //2.创建statement类对象，用来执行SQL语句！！
            String sql = "UPDATE cs_03 SET name='%s' WHERE id = '%s'";//要执行的SQL语句
            if(statement.executeUpdate(String.format(sql,stuinfo[1],stuinfo[0]))!=0)
                System.out.println("更新成功");
            else
                System.out.println("更新失败");
            MySQLconnection.close(statement);
            MySQLconnection.close(con);
        }	catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String[] stuinfo = {"123456","小刚"};
        Update(stuinfo);
    }
}