package com.example.kttk_ca_1;

public class HinhTron implements Shape {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {

    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDT() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhCV() {
        return 2 * Math.PI * banKinh;
    }
}
