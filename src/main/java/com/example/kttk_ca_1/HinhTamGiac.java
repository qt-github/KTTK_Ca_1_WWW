package com.example.kttk_ca_1;

public class HinhTamGiac implements Shape {
    private double canhA;
    private double canhB;
    private double canhC;

    public HinhTamGiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public HinhTamGiac() {

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
        double p = (canhA + canhB + canhC) / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    @Override
    public double tinhCV() {
        return canhA + canhB + canhC;
    }
}
