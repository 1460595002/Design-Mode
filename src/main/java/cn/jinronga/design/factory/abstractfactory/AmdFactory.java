package cn.jinronga.design.factory.abstractfactory;

public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new AmdCpu(111);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(111);
    }
}
