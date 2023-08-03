package com.act.java06.runner;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int m = sc.nextInt();
            HinhChuNhat[] hcn = new HinhChuNhat[m];

            int n = sc.nextInt();
            Square[] hv = new Square[n];

            int p = sc.nextInt(); // so luong hcn can in
            int q = sc.nextInt(); // so luong hv can in

            for (int j = 0; j < m; j++) {
                hcn[j] = new HinhChuNhat(sc.nextDouble(), sc.nextDouble());
            }

            for (int j = 0; j < n; j++) {
                hv[j] = new Square(sc.nextDouble());
            }

            int[] x = new int[p];
            for (int j = 0; j < p; j++) {
                x[j] = sc.nextInt();
            }

            int[] y = new int[q];
            for (int j = 0; j < q; j++) {
                y[j] = sc.nextInt();
            }

            for (int j : x) {
                hcn[j].xuatThongTin();
            }

            for (int j : y) {
                hv[j].xuatThongTin();
            }

        }
    }
}
