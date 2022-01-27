package cn.jinronga.design.adaptive;

import cn.jinronga.design.adaptive.class_adaptive.Computer;
import cn.jinronga.design.adaptive.class_adaptive.SDCard;
import cn.jinronga.design.adaptive.class_adaptive.SDCardImpl;
import cn.jinronga.design.adaptive.class_adaptive.TFCardImpl;

//测试类
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        TFCardImpl tfCard = new TFCardImpl();

        System.out.println(computer.readTF(tfCard));



    }
}