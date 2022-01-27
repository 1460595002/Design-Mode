package cn.jinronga.design.builder;

//测试类
public class Client {
    public static void main(String[] args) {
//        showBike(new OfoBuilder());
//        showBike(new MoBikeBuilder());

        Phone phone = new Phone.Builder()
                .mainboard("骏亚")
                .memory("金士顿")
                .screen("三星")
                .build();

    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}