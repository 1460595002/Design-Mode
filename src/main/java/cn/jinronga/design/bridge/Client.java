package cn.jinronga.design.bridge;

//测试类
public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("不能说的秘密");
        OperatingSystemVersion mac = new Mac(new REVBBFile());
        mac.play("大灌篮");
    }
}