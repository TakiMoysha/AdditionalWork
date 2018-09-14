package ru.namedomen.lesson_1;

public class Main6MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " == " + i * j);
                //sout
//                System.out.print(j + " * " + i + " == " + i * j + "\t\t");
                //souf
                System.out.printf("%d * %d == %d\t\t", j, i, j*i);
            }
            System.out.println();
        }
        System.out.printf("Число %d, string %s, Дробное %.2f", 100, "java", 22.12345);
    }
}
