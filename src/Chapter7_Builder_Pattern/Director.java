package Chapter7_Builder_Pattern;

public class Director {
    private Builder builder;

    // コンストラクタ
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文書を作るメソッド
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的な挨拶");
        builder.makeItems(new String[]{"How are you?", "Hello", "Hi"});
        builder.makeString("時間帯に応じた挨拶");
        builder.makeItems(new String[]{"Good morning.", "Good afternoon.", "Good evening."});
        builder.close();
    }
}
