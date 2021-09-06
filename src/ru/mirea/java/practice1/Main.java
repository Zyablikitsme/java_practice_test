package ru.mirea.java.practice1;

public class Main {
    public static void main(String[] args) {

        Ball balli_01 = new Ball("black", 5, 2020);
        Ball balli_02 = new Ball(2011, 6);
        Ball balli_03 = new Ball("Black-White");

        balli_03.setYear(2015);
        System.out.println(balli_01);
        System.out.println(balli_02);
        System.out.println(balli_03);
    }
}
