package com.example.kttk_ca_1;

public class HinhTamGiacVuong implements Shape {

    private double canhA;
    private double canhB;
    private double canhC;

    public HinhTamGiacVuong(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public HinhTamGiacVuong() {

    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    @Override
    public double tinhDT() {
        return (canhA * canhB) / 2;
    }

    @Override
    public double tinhCV() {
        return canhA + canhB + canhC;
    }
}
