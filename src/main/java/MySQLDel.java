import java.sql.Connection;
import java.sql.Statement;


public class MySQLDel {
    public static void Delete(String id) {
        Connection con;//声明一个连接对象
        //遍历查询结果集
        try {
            con = MySQLconnection.getConnection();//1.调用方法返回连接
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement statement = con.createStatement(); //2.创建statement类对象，用来执行SQL语句！！
            String sql = "DELETE FROM cs_03 WHERE id='%s'";//要执行的SQL语句
            if(statement.executeUpdate(String.format(sql,id))!=0)
                System.out.println("删除成功");
            else
                System.out.println("删除失败");
            MySQLconnection.close(statement);
            MySQLconnection.close(con);
        }	catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Delete("123");
    }
}