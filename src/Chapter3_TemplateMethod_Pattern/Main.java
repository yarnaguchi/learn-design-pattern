package Chapter3_TemplateMethod_Pattern;

public class Main {
    public static void main(String[] args) {
        // 'H'をもったCharDisplayのインスタンスを１個作る
        AbstractDisplay d1 = new CharDisplay('H');

        // "hello, world."を持ったStringDisplayのインスタンスを１個作る
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1, d2とも、全て同じAbstractDisplayのサブクラスのインスタンスだから
        // 継承したdisplayメソッドを呼び出すことができる
        // 実際の動作は個々のクラスCharDisplayやStringDisplayで定まる
        d1.display();
        d2.display();
    }
}
