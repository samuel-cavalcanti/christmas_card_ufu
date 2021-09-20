package christmas_card_ufu;

public class Text implements Widget {

    private final String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void build() {
        System.out.println(content);
    }
}
