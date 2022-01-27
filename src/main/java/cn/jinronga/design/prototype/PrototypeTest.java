package cn.jinronga.design.prototype;

import cn.jinronga.design.prototype.demo.Citation;
import cn.jinronga.design.prototype.demo.Student;
import cn.jinronga.design.prototype.isClone.RealizeType;

import java.io.*;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
//        RealizeType realize = new RealizeType();
//        RealizeType realizeClone = realize.clone();
//
//        System.out.println("他们是同一个对象吗 ：" + (realize==realizeClone));
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("小明");
        citation.setStudent(student);
//        citation.show();
        Citation citationClone = citation.clone();
        Student student1 = new Student();
        student1.setName("小红");
        citation.setStudent(student1);

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (student == student1));
        citation.show();
        citationClone.show();
        OutputStreamTest();
    }

    public static void OutputStreamTest() throws IOException, ClassNotFoundException {


        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStudent(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Project\\Work\\Code\\b.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Project\\Work\\Code\\b.txt"));
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStudent();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}
