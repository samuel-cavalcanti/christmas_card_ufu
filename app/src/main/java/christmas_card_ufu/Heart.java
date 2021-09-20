package christmas_card_ufu;

public class Heart implements Widget {
    private final Widget widget;

    public Heart(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void build() {
        this.widget.build();
        System.out.println(" ** ** ");
        System.out.println("*  *  *");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  * *  ");
        System.out.println("   *   ");

    }
}
