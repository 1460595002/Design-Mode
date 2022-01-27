package cn.jinronga.design.factory.abstractfactory;

/**
 * 电子商城
 */
public class ElectronicStore {
    AbstractFactory factory;

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    /**
     * 提供Cpu
     * @return
     */
    public Cpu getStoreCpu() {
        return factory.createCpu();
    }

    /**
     * 主板
     * @return
     */
    public MainBoard getStore(){
        return factory.createMainBoard();
    }
}
