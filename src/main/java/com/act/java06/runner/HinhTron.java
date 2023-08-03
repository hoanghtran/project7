package com.act.java06.runner;

public class HinhTron implements IHinhHoc{

    double r;

    public HinhTron(double r) {
        this.r = r;
    }
    
    
    @Override
    public double tinhChuVi() {
        return 2 * PI * r;
    }

    @Override
    public double tinhDienTich() {
        return PI * r *r;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("Hinh Tron(r = %.2f): chu vi = %.2f, dien tich = %.2f\n", r, tinhChuVi(), tinhDienTich());
    }
    
}
