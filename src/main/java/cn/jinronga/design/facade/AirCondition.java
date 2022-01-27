package cn.jinronga.design.facade;

/**
 *空调
 */
public class AirCondition  implements Operate{
    public void on() {
        System.out.println("打开了空调....");
    }

    public void off() {
        System.out.println("关闭了空调....");
    }
}