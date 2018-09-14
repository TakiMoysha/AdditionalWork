package AW_Lesson_2;

//TODO test
public class Cat {

    int age;
    String name;
    double weight;
    boolean isMale;
    Tail tail;
    Talisman talisman;

    void voice() {
        System.out.println("Myau");
    }

    void sleep() {
        System.out.println("Hrrr");
    }

    void about() {
        String s = "Cat {" +
                "age=" + age +
                ", name=" + name +
                ", weight=" + weight +
                ", isMale=" + isMale +
                ", tail=" + tail +
                ", talisman=" + talisman +
                "}";
        System.out.println(s);
    }

//        Cat() {
//        System.out.println("Вызвали пустой конструктор");
//  }

    public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;

    }
}
