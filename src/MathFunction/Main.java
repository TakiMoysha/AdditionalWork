package MathFunction;

import java.util.Arrays;

/**
 * Create by TakiMoysha on 26.10.2018
 */
public class Main {
    public static void main(String[] args) {

        //TODO this is test fun countPositivesSumNegatives
        System.out.println(Arrays.toString(function.countPositivesSumNegatives(new int[]{32, -23, 11, 42, -132, -102})));
        System.out.println(Arrays.toString(function.countPositivesSumNegatives(new int[]{2, 23, 21, 32, -12, -21})));
        System.out.println(Arrays.toString(function.countPositivesSumNegatives(new int[]{0, 0})));
        System.out.println(Arrays.toString(function.countPositivesSumNegatives(new int[]{0})));
        System.out.println(Arrays.toString(function.countPositivesSumNegatives(new int[]{})));
        // END TEST


        //TODO this is test fun validatePin
        System.out.println(function.validatePin("0000"));       // true
        System.out.println(function.validatePin("1213"));       // true
        System.out.println(function.validatePin("131245"));     // true
        System.out.println(function.validatePin("654334"));     // true

        System.out.println(function.validatePin("112"));        // false
        System.out.println(function.validatePin("asda"));       // false
        System.out.println(function.validatePin("nty12"));     // false
        System.out.println(function.validatePin("s12391"));     // false
        System.out.println(function.validatePin("112asd"));     // false
        System.out.println(function.validatePin("112s123"));    // false
        System.out.println(function.validatePin("11212321"));   // false
        // END TEST


    }
}
