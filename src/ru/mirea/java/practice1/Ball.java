package ru.mirea.java.practice1;

public class Ball {
    private String color;
    private int year;
    private int size;

    public Ball(String color, int size, int year) {
        this.color = color;
        this.size = size;
        this.year = year;
    }

    public Ball(String color) {
        this.color = color;
        size = 0;
        year = 0;
    }

    public Ball(int year) {
        this.year = year;
        size = 0;
        color = "white";
    }

    public Ball(String color, int year) {
        this.color = color;
        this.year = year;
        size = 0;
    }

    public Ball(int year, int size) {
        this.year = year;
        this.size = size;
        color = "white";
    }

    public Ball() {
        size = 0;
        color = "white";
        year = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", year=" + year +
                '}';
    }
}
