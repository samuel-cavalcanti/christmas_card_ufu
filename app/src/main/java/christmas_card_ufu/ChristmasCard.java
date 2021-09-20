package christmas_card_ufu;

public class ChristmasCard implements Widget {
    private final Widget header;
    private final Widget body;

    public ChristmasCard(Widget header, Widget body) {
        this.header = header;
        this.body = body;
    }

    @Override
    public void build() {
        this.header.build();
        this.body.build();
        System.out.println("Feliz Natal !!");
    }
}
