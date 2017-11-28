package dao;

import entity.User;
import util.DBConn;
import util.DateUtil;

import java.sql.*;
import java.text.SimpleDateFormat;

public class UserDao {
    //增加用户
    public void addUser(User user){
        Connection conn=DBConn.getConn();
        String sql = "Insert into user(name,gender,password,phoneNum,email,birthday) VALUES("+"?,?,?,?,?,?)";
        try {
            PreparedStatement pt=conn.prepareStatement(sql);//先加载到驱动程序，在execute的时候执行；
            pt.setString(1,user.getName());
            pt.setString(2,user.getGender());
            pt.setString(3,user.getPassword());
            pt.setString(4,user.getPhoneNumber());
            pt.setString(5,user.getEmail());
            pt.setDate(6,java.sql.Date.valueOf(user.getBirthday()));
            pt.execute();
            System.out.println("成功添加一条数据！");
        }catch (Exception s){
            System.out.println("SQL异常！");
            return;
        }
        //先编译sql语句，然后给sql语句传递参数；

    }

    //删除用户
    public void delUser(){

    }

    //查看用户
    public void viewUser(){

    }

    //修改用户
    public void modifyUser(){

    }

    //根据手机号查找该用户是否存在
    public User searchByPhone(String phoneNum){
        Connection conn=DBConn.getConn();
        String sql = "SELECT * FROM user WHERE 1=1 AND user.phoneNum=?";
        try {
            ResultSet rs = null;
            PreparedStatement pt=conn.prepareStatement(sql);
            pt.setString(1,phoneNum);
            rs=pt.executeQuery();
            if(rs.next()){
                User user=new User();
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setGender(rs.getString("gender"));
                user.setPhoneNumber(rs.getString("phoneNum"));
                user.setEmail(rs.getString("email"));
                user.setBirthday(rs.getString("birthday"));
                return user;
            }
            else {
                return null;
            }
        }catch (SQLException s){
            System.out.println("根据手机号查找用户失败！");
            return null;
        }
    }
}
