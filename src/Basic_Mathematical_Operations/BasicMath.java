package Basic_Mathematical_Operations;

public class BasicMath {

    String op;
    int v1;
    int v2;

    BasicMath(String op, int v1, int v2) {
        this.op = op;
        this.v1 = v1;
        this.v2 = v2;
    }

    void basicMath() {
        int result = 0;
        if (op.equals("+")) result = v1 + v2;
        if (op.equals("-")) result = v1 - v2;
        if (op.equals("*")) result = v1 * v2;
        if (op.equals("/")) result = v1 / v2;
        System.out.println(result);
    }
}
