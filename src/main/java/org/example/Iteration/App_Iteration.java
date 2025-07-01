package org.example.Iteration;

import java.util.Scanner;

public class App_Iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int a = 0;
        int b = 1;

        System.out.println("F(0) = " + a);
        if (n >= 1) {
            System.out.println("F(1) = " + b);

            for (int i = 2; i <= n; ++i) {
                int nextFib = a + b;
                System.out.println("F(" + i + ") = " + nextFib);
                a = b;
                b = nextFib;
            }
        }
    }
}

