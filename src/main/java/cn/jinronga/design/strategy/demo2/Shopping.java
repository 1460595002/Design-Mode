package cn.jinronga.design.strategy.demo2;

public class Shopping extends StrategyCoupon{
    @Override
    public String queryCouponInfo() {
        return "购物卷发放";
    }
}
