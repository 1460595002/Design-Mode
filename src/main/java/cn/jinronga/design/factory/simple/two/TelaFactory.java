package cn.jinronga.design.factory.simple.two;

import cn.jinronga.design.factory.simple.Car;
import cn.jinronga.design.factory.simple.Tesla;

public class TelaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }

    public static void main(String[] args) {
      String name="o2otest092801-mainaz-2";
      name.split("-");
        System.out.println("截取最后一个-："+name.substring(name.lastIndexOf("-")+1,name.length()));

    }
}
