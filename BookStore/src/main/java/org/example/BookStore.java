package org.example;

public class BookStore {
    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        Book book1 = new Book();
        book1.setTitle("JJJ");
        book1.setAuthor("HHH");
        book1.setPrice(14.00);
        System.out.println(book1.bookInfo());

        Book book2 = new Book("XXX", "ZZZ", 12.00);
        Book book3 = new Book("YYY", "KKK", 7.00);
        System.out.println(book2.bookInfo());
        System.out.println(book3.bookInfo());

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(book1);
        shoppingCart.add(book2);
        shoppingCart.add(book3);
        System.out.println(shoppingCart.receipt());

    }
}