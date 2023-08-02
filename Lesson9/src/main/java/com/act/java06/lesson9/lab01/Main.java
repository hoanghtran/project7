package com.act.java06.lesson9.lab01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int m = sc.nextInt(); // so luong rectangle
            int n = sc.nextInt(); // so luong circle
            int p = sc.nextInt(); // hien thi rec p
            int q = sc.nextInt(); // hien thi cir q

            Rectangle[] hcn = new Rectangle[m];
            Circle[] htron = new Circle[n];

            for (int j = 0; j < m; j++) {
                hcn[j] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }

            for (int j = 0; j < n; j++) {
                htron[j] = new Circle(sc.nextDouble());
            }

            int[] x = new int[p];
            for(int j = 0; j < p; j++){
                x[j] = sc.nextInt();
            }
            
            int[] y = new int[q];
            for(int j = 0; j < q; j++){
                y[j] = sc.nextInt();
            }

            System.out.println("Case #" + (i + 1) + ":");
            for (int j: x) {
                hcn[j].show();
            }

            for (int j: y) {
                htron[j].show();
            }

        }
    }
}
