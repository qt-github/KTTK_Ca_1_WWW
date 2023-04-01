package com.example.kttk_ca_1;

public class HinhThangVuong implements Shape {
    private double canhDayLon;
    private double canhDayNho;
    private double chieuCao;

    public HinhThangVuong(double canhDayLon, double canhDayNho, double chieuCao) {
        this.canhDayLon = canhDayLon;
        this.canhDayNho = canhDayNho;
        this.chieuCao = chieuCao;
    }

    public HinhThangVuong() {

    }

    public double getCanhDayLon() {
        return canhDayLon;
    }

    public void setCanhDayLon(double canhDayLon) {
        this.canhDayLon = canhDayLon;
    }

    public double getCanhDayNho() {
        return canhDayNho;
    }

    public void setCanhDayNho(double canhDayNho) {
        this.canhDayNho = canhDayNho;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDT() {
        return (canhDayLon + canhDayNho) * chieuCao / 2;
    }

    @Override
    public double tinhCV() {
        return canhDayLon + canhDayNho + 2 * Math.sqrt(chieuCao * chieuCao + (canhDayLon - canhDayNho) * (canhDayLon - canhDayNho) / 4);
    }
}
