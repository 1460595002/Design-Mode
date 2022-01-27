package cn.jinronga.design.factory.abstractfactory;

/**
 * intel主板
 */
public class IntelMainBoard implements MainBoard{
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    public IntelMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
    }
}
