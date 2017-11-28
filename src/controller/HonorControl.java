package controller;

import dao.HeroesDao;
import entity.Heroes;

import java.util.ArrayList;

public class HonorControl {
    public void add(Heroes h) throws Exception {
        HeroesDao hd=new HeroesDao();
        hd.addHero(h);
    }
    public void edit(Heroes h) throws Exception {
        HeroesDao hd=new HeroesDao();
        hd.updateHero(h);
    }
    public void del(int delID) throws Exception {
        HeroesDao hd=new HeroesDao();
        hd.deleteHero(delID);
    }
    //choose:1,查询所有的信息；2，根据id查询一位；3，根据名字查询一位；4，根据名字模糊匹配；
    public ArrayList<Heroes> query(int choose,int queryId,String queryName) throws Exception {
        ArrayList<Heroes> arrayList=new ArrayList<Heroes>();
        HeroesDao hd=new HeroesDao();
        switch (choose){
            case 1:
                arrayList=hd.queryAllHero();
                break;
            case 2:
                arrayList.add(hd.queryById(queryId));
                break;
            case 3:
                arrayList.add(hd.queryByName("queryName"));
                break;
            case 4:
                arrayList=hd.queryHeroesByName("queryName");
                break;
        }
        /*if (arr!=null && arr.size()>0){
            for (Heroes h : arr) {
                System.out.println(h.getId()+" "+h.getName()+" "+h.getProperty()+" "+h.setSkinNum());
            }
        }*/
        return arrayList;
    }

}

