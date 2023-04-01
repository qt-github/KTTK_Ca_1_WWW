package com.example.kttk_ca_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KttkCa1Application {

    public static void main(String[] args) {
        //XML-Based Configuration
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //HinhChuNhat
        Shape hcn = (Shape) ctx.getBean("HinhChuNhat");
        System.out.println("Dien tich hcn = " + hcn.tinhDT());
        System.out.println("Chu vi hcn = " + hcn.tinhCV());

        //HinhTamGiac
        Shape htg = (Shape) ctx.getBean("HinhTamGiac");
        System.out.println("Dien tich htg = " + htg.tinhDT());
        System.out.println("Chu vi htg = " + htg.tinhCV());

        //HinhTron
        Shape ht = (Shape) ctx.getBean("HinhTron");
        System.out.println("Dien tich ht = " + ht.tinhDT());
        System.out.println("Chu vi ht = " + ht.tinhCV());

        //HinhThangVuong
        Shape htgv = (Shape) ctx.getBean("HinhThangVuong");
        System.out.println("Dien tich htgv = " + htgv.tinhDT());
        System.out.println("Chu vi htgv = " + htgv.tinhCV());

        //Java-Annotaion-Based Configuration
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);

        //HinhChuNhat
        Shape hcn2 = (Shape) ctx2.getBean("HinhChuNhat");
        System.out.println("Dien tich hcn = " + hcn2.tinhDT());
        System.out.println("Chu vi hcn = " + hcn2.tinhCV());

        //HinhTamGiac
        Shape htg2 = (Shape) ctx2.getBean("HinhTamGiac");
        System.out.println("Dien tich htg = " + htg2.tinhDT());
        System.out.println("Chu vi htg = " + htg2.tinhCV());

        //HinhTron
        Shape ht2 = (Shape) ctx2.getBean("HinhTron");
        System.out.println("Dien tich ht = " + ht2.tinhDT());
        System.out.println("Chu vi ht = " + ht2.tinhCV());

        //HinhThangVuong
        Shape htgv2 = (Shape) ctx2.getBean("HinhThangVuong");
        System.out.println("Dien tich htgv = " + htgv2.tinhDT());
        System.out.println("Chu vi htgv = " + htgv2.tinhCV());
    }

}
