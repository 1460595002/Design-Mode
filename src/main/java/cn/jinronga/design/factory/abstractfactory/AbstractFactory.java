package cn.jinronga.design.factory.abstractfactory;

/**
 * 电子工厂接口
 * 抽象工厂方法
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     * @return CPU对象
     */
     Cpu createCpu();


    /**
     * 创建主板对象
     * @return 主板对象
     */
    public MainBoard createMainBoard();

}
