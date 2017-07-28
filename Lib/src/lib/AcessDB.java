package lib;

import java.sql.*;
import javax.swing.*;

public class AcessDB {
    public Connection ADB() {
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");   //加载SQLServer连接的驱动类
        } catch (ClassNotFoundException ex) {          //返回驱动类无法连接的信息
            JOptionPane.showMessageDialog(null, "未发现jdbc");  //弹出警示框
        }
        Connection con = null;    //初始化连接
        try {
            con = DriverManager.getConnection(
                    "jdbc:microsoft:sqlserver://D24;databasename=Lib", "YanceyLeo", "123456");    //建立连接
            return con;                                                                    //返回已建立的连接
        } catch (SQLException ex) {                 //返回连接无法建立的信息
            JOptionPane.showMessageDialog(null, "sqlserver配置错误");   //弹出警示框
        }
        return null;
    }
}
