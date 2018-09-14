package AW_Lesson_2;

public class Main {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat(3, "Murka", false);

        cat1.age = 3;
        cat1.name = "Iva";

        cat1.about();

        Cat cat2 = new Cat(5, "Tom", true);
        cat2.name = "Tom";
        cat2.age = 5;
        cat2.isMale = true;
        cat2.about();
    }
}
