package Basic_Mathematical_Operations;

public class Main {
    public static void main(String[] args) {

        RepeatStr first = new RepeatStr(3, "Text");
        RepeatStr second = new RepeatStr(6, "Iw");
        BasicMath third = new BasicMath("+", 13, 32);

        first.multiText();
        first.about();

        second.multiText();
        second.about();

        third.basicMath();
        third.about();

    }
}