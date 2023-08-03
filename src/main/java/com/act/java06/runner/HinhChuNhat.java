package com.act.java06.runner;

public class HinhChuNhat implements IHinhHoc {

    double ChieuDai, ChieuRong;

    public HinhChuNhat(double ChieuDai, double ChieuRong) {
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (ChieuDai + ChieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return ChieuDai * ChieuRong;
    }

    @Override
    public void xuatThongTin() {
        System.out.printf("HCN(%f, %f): chu vi = %.3f, dien tich = %.3f\n", ChieuDai, ChieuRong, tinhChuVi(), tinhDienTich());
    }

}
