package com.act.java06.lesson9;

import java.util.Scanner;

public class Lesson9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            FullTimeEmployee[] ftime = new FullTimeEmployee[m];
            PartTimeEmployee[] ptime = new PartTimeEmployee[n];

            int p = sc.nextInt();
            int q = sc.nextInt();

            for (int j = 0; j < m; j++) {
                String skip = sc.nextLine();

                String name = sc.nextLine();
                int hours = sc.nextInt();
                ftime[j] = new FullTimeEmployee(name, hours);
            }

            for (int j = 0; j < n; j++) {
                String skip = sc.nextLine();

                String name = sc.nextLine();
                int payment = sc.nextInt();
                int hours = sc.nextInt();
                ptime[j] = new PartTimeEmployee(hours, name, payment);
            }

            System.out.println("Case #" + (i + 1) + ":");
            
            int[] x = new int[p];
            for (int j = 0; j < p; j++) {
                x[j] = sc.nextInt();
            }

            int[] y = new int[q];
            for (int j = 0; j < q; j++) {
                y[j] = sc.nextInt();
            }

            for (int j: x) {
                ftime[j].showInfo();
            }

            for (int j: y) {
                ptime[j].showInfo();
            }
        }
    }
}
