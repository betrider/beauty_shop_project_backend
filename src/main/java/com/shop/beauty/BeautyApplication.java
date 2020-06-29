package com.shop.beauty;

import com.shop.beauty.api.common.mapper.CityMapper;
import com.shop.beauty.api.common.service.CityService;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class BeautyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautyApplication.class, args);
    }
}
