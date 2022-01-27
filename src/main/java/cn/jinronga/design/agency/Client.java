package cn.jinronga.design.agency;

import cn.jinronga.design.agency.staticdemo.ProxyPoint;

//测试类
public class Client {
    public static void main(String[] args) {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}