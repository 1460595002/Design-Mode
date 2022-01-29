package cn.jinronga.design.iterator;

import cn.jinronga.design.prototype.demo.Student;

public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}