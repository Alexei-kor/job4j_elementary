package ru.job4j;


import other.WhereBig;

public class Main {

    static class Inner {
        public static String getName() {
            return "Xuan";
        }
    }

    public static void main(String[] args) {

        System.out.printf("Hello %S", Inner.getName());

        WhereBig whereBig = new WhereBig() {
            @Override
            public int getCount() {
                return 77;
            }
        };

        System.out.println(whereBig.getCount());
        System.out.println("ssss");

    }
}