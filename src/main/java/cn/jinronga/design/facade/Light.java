package cn.jinronga.design.facade;

//灯类
public class Light implements Operate{
    public void on() {
        System.out.println("打开了灯....");
    }

    public void off() {
        System.out.println("关闭了灯....");
    }
}