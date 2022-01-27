package cn.jinronga.design.flyweight;

/**
 * 俄罗斯方块有不同的形状，我们可以对这些形状向上抽取出AbstractBox，
 * 用来定义共性的属性和行为。
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}