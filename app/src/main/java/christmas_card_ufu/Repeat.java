package christmas_card_ufu;

public class Repeat implements Widget {
    private final Widget widget;
    private final int numberOfTimes;

    public Repeat(Widget widget, int numberOfTimes) {
        this.widget = widget;
        this.numberOfTimes = numberOfTimes;
    }

    @Override
    public void build() {

        for (int i = 0; i < this.numberOfTimes; i++) {
            widget.build();
        }

    }
}
