package cn.jinronga.design.factory.abstractfactory;

/**
 * intel工厂
 */
public class IntelFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(111);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(111);
    }
}
