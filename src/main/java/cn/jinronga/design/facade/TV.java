package cn.jinronga.design.facade;

//电视类
public class TV  implements Operate{
    public void on() {
        System.out.println("打开了电视....");
    }

    public void off() {
        System.out.println("关闭了电视....");
    }
}