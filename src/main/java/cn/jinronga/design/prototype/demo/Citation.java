package cn.jinronga.design.prototype.demo;

import java.io.Serializable;

//奖状类
public class Citation implements Cloneable, Serializable {
    private Student student;



    public Citation() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("对象克隆成功！" + student.getName());
        return (Citation) super.clone();
    }
}
