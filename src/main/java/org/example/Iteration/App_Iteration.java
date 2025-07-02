package org.example.Iteration;

import java.util.Scanner;

public class App_Iteration {
    public  static int fib(int n) {
        if (n <= 0) {
            return n;
        }

        int a = 0;
        int b = 1;
        int nextFib = 0;

        for (int i = 2; i <= n; i++) {
            nextFib = a + b;
            a = b;
            b = nextFib;
        }
        return nextFib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; ++i) {
            System.out.println("F(" + i + ") = " + fib(i));
        }
    }
}

