package com.tgdajay;

import java.util.*;

public class new1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // addition karna
        System.out.print("Enter a and b for addition ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);

        // subtraction karna
        System.out.print("Enter a and b for subtraction ");
        a = sc.nextInt();
        b = sc.nextInt();
        int sub = a - b;
        System.out.println("Difference = " + sub);

        // Multiplication
        System.out.println("Enter your multiplication number");
        a = sc.nextInt();
        b = sc.nextInt();
        int mul = a * b;
        System.out.println("Product = " + mul);

        // division
        System.out.println("Enter your division number");
        a = sc.nextInt();
        b = sc.nextInt();
        int div = a / b;
        System.out.println("Quotient = " + div);

        // modulus
        System.out.println("Enter your modulus number");
        a = sc.nextInt();
        b = sc.nextInt();
        int mod = a % b;
        System.out.println("Remainder = " + mod);
    }
}