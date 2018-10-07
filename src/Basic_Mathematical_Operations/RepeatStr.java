package Basic_Mathematical_Operations;

class RepeatStr {

    private String text;
    private int n;

    RepeatStr(int n, String text) {
        this.n = n;
        this.text = text;
    }

    void about() {System.out.printf("%d, %s\n", n, text);}

    void multiText() {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += this.text;
        }

        System.out.println(result);
    }
}
