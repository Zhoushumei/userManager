//object Main
import testCoreJava.Test;

import java.util.Scanner;

/**
 * The test function
 * @author Sumey
 *
* */
public class Main {
        /**@param
         * @throws
         * */
        public  int[] fun(){
            int[] ints={1,2,3};
            System.out.println("1"+ints);
            return ints;

        }
    public static void main(String[] args) {
        /*String a="123";
        String b="123";
        System.out.println(a==b);
        String c=new String("123");
        String d=c.intern();
        System.out.println(b==d);*/
       // System.out.println(open);
       // String[] str=new String[]{""};
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入字符串：");
            String s=sc.next();
            System.out.println("您输入的是："+s);
        }

    }
}
