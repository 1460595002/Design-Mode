package cn.jinronga.design.factory.abstractfactory;

public class Customer {
    public static void main(String[] args) {
        ElectronicStore store = new ElectronicStore();
        AbstractFactory amdFactory = new AmdFactory();
//        IntelFactory intelFactory = new IntelFactory();
        store.setFactory(amdFactory);
        store.getStore();

        Cpu storeCpu = store.getStoreCpu();
        storeCpu.calculate();

    }
}
