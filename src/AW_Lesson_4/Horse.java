package AW_Lesson_4;

public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    void eat() {
        about();
        System.out.println("eating...");
    }

    //Тернарный оператор
    void about() {
        String sex = (isMale) ? "Male" : "Female";
        System.out.printf("Name: %s, age: %d, sec %s\t\t", name, age, sex);
    }

    void ride() {
        about();
        System.out.println("Riding at speed" + speed);
    }
}
