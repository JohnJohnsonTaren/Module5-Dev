package org.example.Iteration;

import java.util.Scanner;

public class App_Iteration {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i < n; ++i) {
            System.out.println("F(" + i + ") = " + f[i]);
        }
    }
}
