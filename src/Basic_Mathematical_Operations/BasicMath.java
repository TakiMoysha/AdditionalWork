package Basic_Mathematical_Operations;

public class BasicMath {

    String op;
    int v1;
    int v2;

    public static Integer basicMath(String op, int v1, int v2)
    {
        int result = 0;
        if (op == "+") {
            result = v1 + v2;
        } if (op == "-") {
        result = v1 - v2;
    } if (op == "*") {
        result = v1 * v2;
    } if (op == "/") {
        result = v1 / v2;
    }
        return result;
    }
}
