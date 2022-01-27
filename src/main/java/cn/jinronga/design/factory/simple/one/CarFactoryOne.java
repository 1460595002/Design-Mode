package cn.jinronga.design.factory.simple.one;

import cn.jinronga.design.factory.simple.Audi;
import cn.jinronga.design.factory.simple.Car;
import cn.jinronga.design.factory.simple.Tesla;

import java.util.Arrays;
import java.util.List;

//开闭原则
public class CarFactoryOne {
    public static Car getCar(String car) {
        if (car.equals("奥迪！")) {
            return new Audi();
        } else if (car.equals("特斯拉！")) {
            return new Tesla();
        } else {
            return null;
        }
    }

    //方式二：
    public static Car getAudi() {

        return new Audi();
    }

    public static Car getTesla() {
        return new Tesla();
    }


    public static void main(String[] args) {
        String version="";
        String[] split = version.split("-");
        List<String> strings = Arrays.asList(split);

        System.out.println("split = " + split);
//        String s = String.valueOf("");
    }
}
