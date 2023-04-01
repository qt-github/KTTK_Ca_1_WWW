package com.example.kttk_ca_1;

import org.springframework.stereotype.Component;

@Component
public class HinhChuNhat implements Shape {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {

    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDT() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhCV() {
        return (chieuDai + chieuRong) * 2;
    }
}
