package ru.mirea.java.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author autho = new Author(
                "Donald South",
                "DonaldSouth@gmail.com",
                'm');

        System.out.println(autho);
        autho.setEmail("BestAuthorEver91034123@gmail.com");

        System.out.println(autho);
    }


}
