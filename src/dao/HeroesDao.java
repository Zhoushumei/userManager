package dao;

import entity.Heroes;
import util.DBConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HeroesDao {
    //增加英雄；
    public void addHero(Heroes hr) throws Exception{
        Connection conn=DBConn.getConn();
        String sql = "Insert into heroes(name,property,skinNumber) VALUES("+"?,?,?)";
        PreparedStatement pt=conn.prepareStatement(sql);//先加载到驱动程序，在execute的时候执行；
        //先编译sql语句，然后给sql语句传递参数；
        pt.setString(1,hr.getName());
        pt.setString(2,hr.getProperty());
        pt.setInt(3,hr.getSkinNum());
        pt.execute();
    }
    //删除英雄；
    public void deleteHero(int i) throws Exception{
        Connection conn=DBConn.getConn();
        String sql = "DELETE FROM heroes WHERE id=?";
        PreparedStatement pt=conn.prepareStatement(sql);
        pt.setInt(1,i);
        pt.execute();
    }
    //更改英雄的信息；
    public void updateHero(Heroes hr) throws Exception{
        Connection conn=DBConn.getConn();
        String sql = "UPDATE  heroes SET name=?,property=?,skinNumber=? WHERE id=?";
        PreparedStatement pt=conn.prepareStatement(sql);
        pt.setString(1,hr.getName());
        pt.setString(2,hr.getProperty());
        pt.setInt(3,hr.getSkinNum());
        pt.setInt(4,hr.getId());
        pt.execute();
    }
    //查询所有的英雄；
    public ArrayList<Heroes> queryAllHero() throws Exception{
        Connection conn=DBConn.getConn();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM heroes");
        ArrayList<Heroes> heroesList=new ArrayList<Heroes>();
        Heroes hero=null;
        while (rs.next()){
            hero=new Heroes();
            hero.setId(rs.getInt("id"));
            hero.setName(rs.getString("name"));
            hero.setProperty(rs.getString("property"));
            hero.setSkinNum(rs.getInt("skinNumber"));
            heroesList.add(hero);
        }
        return heroesList;
    }
    //根据id查询某位英雄的信息；
    public Heroes queryById(int i)throws Exception{
        Heroes hr=null;
        Connection conn=DBConn.getConn();
        String sql = "SELECT * FROM heroes WHERE id=?";
        PreparedStatement pt=conn.prepareStatement(sql);
        pt.setInt(1,i);
        ResultSet rs=pt.executeQuery();
        while (rs.next()){
            hr=new Heroes();
            hr.setId(rs.getInt("id"));
            hr.setName(rs.getString("name"));
            hr.setProperty(rs.getString("property"));
            hr.setSkinNum(rs.getInt("skinNumber"));
        }

        return hr;
    }
    //根据名字查询某位英雄的信息；
    public Heroes queryByName(String pname)throws Exception{
        Heroes hr=null;
        Connection conn=DBConn.getConn();
        String sql = "SELECT * FROM heroes WHERE name =?";
        PreparedStatement pt=conn.prepareStatement(sql);
        pt.setString(1,pname);
        ResultSet rs=pt.executeQuery();
        while (rs.next()){
            hr=new Heroes();
            hr.setId(rs.getInt("id"));
            hr.setName(rs.getString("name"));
            hr.setProperty(rs.getString("property"));
            hr.setSkinNum(rs.getInt("skinNumber"));
        }

        return hr;
    }
    //根据名字模糊匹配查询英雄的信息；
    public ArrayList<Heroes> queryHeroesByName(String pname) throws Exception{
        Connection conn=DBConn.getConn();
        String sql="SELECT * FROM heroes WHERE name LIKE ?";
        PreparedStatement pt=conn.prepareStatement(sql);
        pt.setString(1,"%"+pname+"%");
        ResultSet rs=pt.executeQuery();
        ArrayList<Heroes> heroesList=new ArrayList<Heroes>();
        Heroes hero=null;
        while (rs.next()){
            hero=new Heroes();
            hero.setId(rs.getInt("id"));
            hero.setName(rs.getString("name"));
            hero.setProperty(rs.getString("property"));
            hero.setSkinNum(rs.getInt("skinNumber"));
            heroesList.add(hero);
        }
        return heroesList;
    }
}
