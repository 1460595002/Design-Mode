package cn.jinronga.design.adaptive.class_adaptive;

//电脑类
public class Computer {

    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
    public String readTF(TFCard tfCard){
        if (tfCard==null){
            throw new NullPointerException("tf card null");
        }
        return tfCard.readTF();
    }
}