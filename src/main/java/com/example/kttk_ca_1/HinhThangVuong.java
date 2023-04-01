package com.example.kttk_ca_1;

public class HinhThangVuong implements Shape {
    private HinhChuNhat hcn;
    private HinhTamGiacVuong htgv;

    public HinhThangVuong(HinhChuNhat hcn, HinhTamGiacVuong htgv) {
        this.hcn = hcn;
        this.htgv = htgv;
    }

    public HinhThangVuong(Shape hinhChuNhat, Shape hinhTamGiacVuong) {
    }

    public HinhChuNhat getHcn() {
        return hcn;
    }

    public void setHcn(HinhChuNhat hcn) {
        this.hcn = hcn;
    }

    public HinhTamGiacVuong getHtgv() {
        return htgv;
    }

    public void setHtgv(HinhTamGiacVuong htgv) {
        this.htgv = htgv;
    }


    @Override
    public double tinhDT() {
        return hcn.tinhDT() + htgv.tinhDT();
    }

    @Override
    public double tinhCV() {
        return hcn.tinhCV() + htgv.tinhCV() - 2 * hcn.getChieuDai();
    }
}
