package cn.jinronga.design.visitor;

public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}