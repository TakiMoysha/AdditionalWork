package ru.namedomen.lesson_1;

/**
 * @author TakiMoysha
 * Java doc - документация к html, будет записываться в документацию
 */
/* многострочный
комментарий
crt+d - copy string
 */

/*
рецепт, метод, функция, процедура, программа
 */

public class Kitchen {

    public static void main(String[] args) {
        System.out.println("main");
        cookBreakfast();
        cookSoop();
    }

    static void cookSoop() {
        System.out.println("Boil water\n...\ndone"); // sout+tab
//        System.out.println("...");
//        System.out.println("done");

    }

    static void cookBreakfast() {
        System.out.println("Breakfast done");
    }
}
