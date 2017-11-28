package view;

import controller.HonorControl;
import controller.UserControl;
import entity.Heroes;
import entity.User;
import util.DateUtil;

import java.util.ArrayList;
import java.util.Date;

public class View {
    public static void main(String[] args) throws Exception {
        /*HonorControl hc = new HonorControl();
        Heroes h=new Heroes();
        h.setId(1);
        h.setName("狐白");
        h.setProperty("剑客");
        h.setSkinNum(3);
        hc.edit(h);
        ArrayList<Heroes> arrayList=hc.query(1,0,"");
        if (arrayList != null && arrayList.size() > 0) {
            for (Heroes h1 : arrayList) {
                System.out.println(h1.getId() + " " + h1.getName() + " " + h1.getProperty() + " " + h1.getSkinNum());
            }
        }*/

        UserControl userControl = new UserControl();
        User user = new User("sumey", "root", "女", "17853146483", "1996-02-14", "1561586922@qq.com");
        User user1 = new User("kiven", "kiven", "女", "17853146487", "1997-01-24","739242413@qq.com");
        userControl.add(user1);
    }

}
