package com.example.kttk_ca_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.kttk_ca_1")
public class AppConfig {

    @Bean(name = "HinhChuNhat")
    public Shape hinhChuNhat() {
        return new HinhChuNhat(5, 6);
    }

    @Bean(name = "HinhTamGiac")
    public Shape hinhTamGiac() {
        return new HinhTamGiac(3, 4, 5);
    }

    @Bean(name = "HinhTron")
    public Shape hinhTron() {
        return new HinhTron(5);
    }

    @Bean(name = "HinhTamGiacVuong")
    public Shape hinhTamGiacVuong() {
        return new HinhTamGiacVuong(3, 4, 5);
    }

    @Bean(name = "HinhThangVuong")
    public Shape hinhThangVuong() {
        return new HinhThangVuong(hinhChuNhat(), hinhTamGiacVuong());
    }
}
