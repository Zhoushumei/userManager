package controller;

import dao.UserDao;
import entity.User;

public class UserControl {
    //增加用户
    public void add(User user) throws Exception{
        UserDao userDao=new UserDao();
        userDao.addUser(user);

    }

    //删除用户
    public void del(){

    }
    //查看用户
    public void view(){

    }
    //修改用户
    public void modify(){

    }
    //根据手机号查找该用户是否存在
    public User searchByPhone(String phoneNum){
        UserDao userDao=new UserDao();
        return userDao.searchByPhone(phoneNum);
    }
}
