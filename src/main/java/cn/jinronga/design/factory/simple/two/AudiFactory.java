package cn.jinronga.design.factory.simple.two;

import cn.jinronga.design.factory.simple.Audi;
import cn.jinronga.design.factory.simple.Car;

public class AudiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }

}
