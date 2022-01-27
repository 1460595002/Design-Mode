package cn.jinronga.design.strategy.demo2;

public class ContextStrategy {
    //持有公共接口的引用，后续通过多态来获取【红包，购物券等】的实现
    StrategyCoupon strategyCoupon;

    public ContextStrategy(StrategyCoupon strategyCoupon) {
        this.strategyCoupon = strategyCoupon;
    }

    public String contextInterface(){
        return strategyCoupon.queryCouponInfo();
    }
}
