package org.example.DP;

import java.util.Scanner;

public class App_DP {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        App_DP calculator = new App_DP();

        for (int i = 0; i <= n; ++i) {
            System.out.println("F(" + i + ") = " + calculator.fib(i));
        }
    }
}

