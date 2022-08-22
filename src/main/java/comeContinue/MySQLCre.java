package comeContinue;

import java.sql.Connection;
import java.sql.Statement;

public class MySQLCre {

    public static void CreDatabase() {
        Connection con;//声明一个连接对象
        //遍历查询结果集
        try {
            con = MySQLconnection.getConnection();//1.调用方法返回连接
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            Statement statement = con.createStatement(); //2.创建statement类对象，用来执行SQL语句！！
            String sql = "CREATE DATABASE spiders DEFAULT CHARACTER SET utf8mb4";//要执行的SQL语句
            statement.executeUpdate(sql);
            MySQLconnection.close(statement);
            MySQLconnection.close(con);
        }	catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	CreDatabase();
    }

}