package util;

import java.sql.*;

public class DBConn {

    //private static final String URL="jdbc:mysql://localhost:3306/homework?useUnicode=true&&characterEncoding=UTF-8";
    private static final String URL="jdbc:mysql://39.106.138.125:3306/homework?useUnicode=true&&characterEncoding=UTF-8";
    private static final String USER="root";
    private static final String PASSWORD="root";

    private static Connection conn=null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(URL,USER,PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        return conn;
    }

    public static void main(String[] args) throws Exception {


        //加载驱动程序，用反射的技术；
        //这个语句要么写main方法里面，要么加上static语句块，否则报错；
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM heroes");
        //System.out.println(rs);
        while (rs.next()){
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("property")+" ");
            System.out.print(rs.getInt("skinNumber"));
            System.out.println();
        }
    }


}

