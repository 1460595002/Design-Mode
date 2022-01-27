package cn.jinronga.design.factory.abstractfactory;

/**
 * AMD主板
 */
public class AmdMainBoard implements MainBoard{
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    public AmdMainBoard(int cpuHoles) {
        System.out.println("ADM主板的CPU插槽孔数是：" + cpuHoles);
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("ADM主板的CPU插槽孔数是：" + cpuHoles);

    }
}
