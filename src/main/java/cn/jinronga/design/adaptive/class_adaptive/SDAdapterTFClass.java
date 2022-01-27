package cn.jinronga.design.adaptive.class_adaptive;

//定义适配器类（SD兼容TF）
public class SDAdapterTFClass implements SDCard {
    TFCard tfCardl;

    public SDAdapterTFClass(TFCard tfCardl) {
        this.tfCardl = tfCardl;
    }

    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCardl.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCardl.writeTF(msg);
    }
}