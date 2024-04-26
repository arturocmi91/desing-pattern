package CreationalDesingPatterns.Singleton;

import CreationalDesingPatterns.FactoryMethod.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSingleton {
    public static void main(String[] args){
     // with only for one thread MONOTASK
      /*  ShoppingCart shoppingCart= ShoppingCart.getShopping("36334.3422");


        shoppingCart.addItem("Guayaba");
        shoppingCart.addItem("Patilla");
        shoppingCart.addItem("Cambur");

        shoppingCart.displayItems();
        System.out.println(shoppingCart);
        shoppingCart= ShoppingCart.getShopping("123.23");


        System.out.println(shoppingCart);*/
        // MULTITASK MORE OF THE ONE Threads

        Thread threadFirstTask = new Thread(new RunFirstAttempt());
        Thread threadSecondTask = new Thread(new RunSecondAttempt());

        threadFirstTask.start();
        threadSecondTask.start();



    }
    static class RunFirstAttempt implements Runnable{

        @Override
        public void run() {
            ShoppingCart shoppingCart= ShoppingCart.getShopping("163.34.3422");

            shoppingCart.addItem("Guayaba");
            shoppingCart.addItem("Patilla");
            shoppingCart.addItem("Cambur");
            System.out.println("Running First Attempt: "+ shoppingCart);
        }
    }
    static class RunSecondAttempt implements Runnable{

        @Override
        public void run() {
            ShoppingCart shoppingCart = ShoppingCart.getShopping("123.23.3455");

            shoppingCart.addItem("Guayaba");
            shoppingCart.addItem("Patilla");
            shoppingCart.addItem("Cambur");
            System.out.println("Running Second Attempt: "+ shoppingCart);
        }
    }
}
