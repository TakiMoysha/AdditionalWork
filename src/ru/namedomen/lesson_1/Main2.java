package ru.namedomen.lesson_1;

public class Main2 {
    public static void main(String[] args) {

//        Примитивные типы. Хранят значения в себе. Хранятся в стеке.
        byte bt = 127;
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128

        short sh = 32000;
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768

        int i = 2147483647;
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        long l = 2147483640000000000L;
        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); //-9223372036854775808

        char ch = 43;
        System.out.println(ch);
//        System.out.println(Character.MIN_VALUE);

        String s = "Hello"; // String - это класс, по этому пишется с большой буквы
        System.out.println(s);

        boolean b = true; // true or false
        System.out.println(b);

        // Плавающие числа

        double d = 12.3;    //Не используют в вычислениях, т.к округляются непредсказуемо. Не пользуются банки.
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        float f = 12.3f;    //Не используют в вычислениях, т.к округляются непредсказуемо. Не пользуются банки.
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        Void v = null;
        System.out.println(v);

//        BigDecimal BD;    //Большие, бесконечные, целочисленные
//        BigInteger BI;    //Большие, бесконечные, дробные


    }
}
