package org.example.Recursion;

import java.util.Scanner;

public class App_Recursion {
    public static int f(int n) {
        if (n <= 1) {
            return n;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; ++i) {
            System.out.println("F(" + i + ") = " + f(i));
        }
    }
}
