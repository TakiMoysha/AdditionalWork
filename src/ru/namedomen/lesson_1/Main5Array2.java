package ru.namedomen.lesson_1;

import java.util.Arrays;

public class Main5Array2 {
    public static void main(String[] args) {
        //бъектный тип данных. Хранятся в куче. Нужно в ручную выделять память "new".
        Kitchen kitchen;
        Dog dod;
        Main5Array2 m;

        int a;
        a = 10;

        int[] stable;// так будет называться наше стойло
//        stable = {2, 3, 5}; // не работает
        stable = new int[100];// построили стойло на 100 лошадей

        System.out.println(Integer.valueOf(stable[0]));
//        stable[0] = 10;

//        for (int number : stable) {

        stable[3] = 55;
        System.out.println(Arrays.toString(stable));
    }
}
