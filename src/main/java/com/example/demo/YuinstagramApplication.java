package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.GetImgService;

@SpringBootApplication
public class YuinstagramApplication {

    public static void main(String[] args) {
        // GetImgService service = new GetImgService();
        // try {
        // service.pickup();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        SpringApplication.run(YuinstagramApplication.class, args);
    }
}
