package ru.namedomen.lesson_1;

public class Main3ifSwich {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;

        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        int grade = 3;
//        if (grade == 3) {
//            System.out.println("Norm");
//        } if (grade == 4) {
//            System.out.println("Good");
//        }

        int grade = 3;
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Norm");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("Out of range");
        }

    }
}
