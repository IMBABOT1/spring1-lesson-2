package ru.geekbrains.spring1.lesson2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains.spring1.lesson2");
        Cart cart = context.getBean(Cart.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("/add1 to add first product");
        System.out.println("/add2 to add second product");
        System.out.println("/add3 to add third product");
        System.out.println("/add4 to add four product");
        System.out.println("/add5 to add five product");

        System.out.println("/remove1 to remove first product");
        System.out.println("/remove2 to remove second product");
        System.out.println("/remove3 to remove third product");
        System.out.println("/remove4 to remove four product");
        System.out.println("/remove5 to remove five product");

        System.out.println("/all to show cart");

        System.out.println("/end to exit");

        while (true) {
            String cmd = sc.nextLine();
            switch (cmd) {
                case ("/add1"):
                    cart.addProductById(1l);
                    System.out.println(cart);
                    break;
                case ("/add2"):
                    cart.addProductById(2l);
                    System.out.println(cart);
                    break;
                case ("/add3"):
                    cart.addProductById(3l);
                    System.out.println(cart);
                    break;
                case ("/add4"):
                    cart.addProductById(4l);
                    System.out.println(cart);
                    break;
                case ("/add5"):
                    cart.addProductById(5l);
                    System.out.println(cart);
                    break;
                case ("/remove1"):
                    cart.deleteProductById(1l);
                    System.out.println(cart);
                    break;
                case ("/remove2"):
                    cart.deleteProductById(2l);
                    System.out.println(cart);
                    break;
                case ("/remove3"):
                    cart.deleteProductById(3l);
                    System.out.println(cart);
                    break;
                case ("/remove4"):
                    cart.deleteProductById(4l);
                    System.out.println(cart);
                    break;
                case ("/remove5"):
                    cart.deleteProductById(5l);
                    System.out.println(cart);
                    break;
                case ("/all"):
                    System.out.println(cart.showCart());
                    break;
                case ("/end"):
                    return;

            }
            context.close();
        }
    }
}
