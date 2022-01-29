package cn.jinronga.design.iterator;

import cn.jinronga.design.prototype.demo.Student;

public interface StudentIterator {
    boolean hasNext();
    Student next();
}