package cn.jinronga.design.agency.staticdemo;

import cn.jinronga.design.agency.SellTickets;

//代售点
public class ProxyPoint implements SellTickets {

    private TrainStation station = new TrainStation();

    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }
}