package cn.jinronga.design.strategy.commands;

public interface Command {
    /**
     * 只需要定义一个统一的执行方法
     */
    void execute();
}