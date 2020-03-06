package com.company;

public class Main {

    public static void main(String[] args) {
        int[] school = new int[5];
        school[0] = 0;
        school[1] = 1;
        school[2] = 2;
        school[3] = 3;
        school[4] = 4;
        for (int i = 0; i < 5; i++) {
            System.out.print(school[i]);
            switch (school[i]) {
                case 0:
                    System.out.println(".Петя 10");
                    break;
                case 1:
                    System.out.println(".Вася 7.5");
                    break;
                case 2:
                    System.out.println(".Гена 6");
                    break;
                case 3:
                    System.out.println(".Андрей 2");
                    break;
                case 4:
                    System.out.println(".Вика 4");

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(school[i]);
            switch (school[i]) {
                case 0:
                    System.out.println(".Петя отличник");
                    break;
                case 1:
                    System.out.println(".Вася хорошист");
                    break;
                case 2:
                    System.out.println(".Гена хорошист");
                    break;
                case 3:
                    System.out.println(".Андрей двоечник");
                    break;
                case 4:
                    System.out.println(".Вика двоечница");

            }
        }
    }
}
