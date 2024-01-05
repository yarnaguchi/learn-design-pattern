package Chapter6_Prototype_Pattern.Exercises;

import Chapter6_Prototype_Pattern.Exercises.framework.Manager;
import Chapter6_Prototype_Pattern.Exercises.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 登録
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成と使用
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
