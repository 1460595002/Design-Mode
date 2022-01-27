package cn.jinronga.design.strategy.demo2;

public class Test {
    public static void main(String[] args) {
        getCouponInfoByType("红包");
    }


    public static String getCouponInfoByType(String resourceType) {
        String typeInfo="";
        switch (resourceType) {
            case "红包":
                 typeInfo = new ContextStrategy(new RedPaper()).contextInterface();
                System.out.println("发放方式："+typeInfo);
                break;
            case "优惠卷":
                typeInfo = new ContextStrategy(new Shopping()).contextInterface();
                System.out.println("发放方式:"+typeInfo);
                break;
            default:
                System.out.println("查找不到该优惠券类型resourceType以及对应的派发方式");
                break;
        }

        return typeInfo;
    }
}
