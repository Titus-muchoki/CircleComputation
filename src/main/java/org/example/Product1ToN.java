package org.example;

public class Product1ToN {
    public static void main(String[] args)
    {
        Product1ToN aProduct1ToN = new Product1ToN();
        aProduct1ToN.printProduct1ToN(10);
        aProduct1ToN.printProduct1ToN(11);
        aProduct1ToN.printProduct1ToN(12);
        aProduct1ToN.printProduct1ToN(13);
        aProduct1ToN.printProduct1ToN(14);
    }

    public void printProduct1ToN(int n)
    {
        long prod = 1L;
        for(int i=1; i <= n; i++) {
            prod *= i;
        }
        System.out.println("8. Product of integers 1 to " + n + ".");
        System.out.println(prod);
    }
}
