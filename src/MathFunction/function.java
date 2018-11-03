package MathFunction;

/**
 * Create by TakiMoysha on 26.10.2018
 */
public class function {

    static int[] countPositivesSumNegatives(int[] input) {
        int countPositive = 0;
        int sumNegative = 0;
        int result[] = new int[] {};

        if (input == null || input.length == 0) {
            return result;
        } if (input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    countPositive += 1;
                } if (input[i] < 0) {
                    sumNegative += input[i];
                }
                result = new int[] {countPositive, sumNegative};
            }
        }
        return result;
    }

    static boolean validatePin(String pin) {
        char pinArray[] = pin.toCharArray();
        char array[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


        if (pinArray.length == 4 || pinArray.length == 6) {
            for (int i = 0; i < pinArray.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    while (pinArray[i] == array[j]) {
                        i++;
                        j = 0;
                        if (pinArray.length == i) return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}