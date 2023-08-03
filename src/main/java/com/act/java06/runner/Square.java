package com.act.java06.runner;

public class Square extends HinhChuNhat{
    
    public Square(double Length) {
        super(Length, Length);
    }
    
    @Override
    public void xuatThongTin(){
        System.out.printf("HV(%f): chu vi = %.3f, dien tich = %.3f\n", ChieuDai, tinhChuVi(), tinhDienTich());
    }
}
