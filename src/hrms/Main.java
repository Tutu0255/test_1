package hrms;

import java.sql.*;

public class Main {

    public static void main(String[] args)

    {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

//将Test换成你自己的数据库名

        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=HRMS";

        String userName = "sa";

//将密码改成自己设置的密码

        String userPwd = "HHXX23..";

        Connection dbConn = null;

        try

        {

            Class.forName(driverName);

            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);

            System.out.println("连接数据库成功");

        }

        catch (Exception e)

        {

            e.printStackTrace();

            System.out.print("连接失败");

        }

    }

}
