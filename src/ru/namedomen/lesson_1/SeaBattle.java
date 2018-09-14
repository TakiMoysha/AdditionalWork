package ru.namedomen.lesson_1;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }

        int position = 4;
        cells[position] = 'X';

//        for(char cell : cells) {
//            System.out.println(cell);
//        }

        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели: %s\n", s);

            int shoot = Integer.parseInt(s);

            switch (cells[shoot]) {
                case '.':
                    System.out.println("Lose");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Great! Ship destroyed!");
                    cells[shoot] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Nope. They already shot here.");
                    break;
                default:
                    System.out.println("ERROR");
            }

        } while (cells[position] == 'X');

    }
}
