package christmas_card_ufu;

public class Margin implements Widget {
    private final Widget w;
    private final int row;
    private final int col;

    public Margin(int row, int col, Widget widget) {
        this.row = row;
        this.col = col;
        this.w = widget;
    }

    @Override
    public void build() {
        String horizontalSpaces = "";

        for (int i = 0; i < col; i++)
            horizontalSpaces += ' ';

        String verticalSpaces = "";

        for (int i = 0; i < row; i++)
            verticalSpaces += "\n";


        System.out.print(verticalSpaces);
        System.out.print(horizontalSpaces);
        this.w.build();
        System.out.print(horizontalSpaces);
        System.out.print(verticalSpaces);


    }
}
