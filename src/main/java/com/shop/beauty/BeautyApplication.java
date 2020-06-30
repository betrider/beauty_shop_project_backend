package com.shop.beauty;

import com.shop.beauty.api.common.mapper.CityMapper;
import com.shop.beauty.api.common.service.CityService;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@MapperScan
public class BeautyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BeautyApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BeautyApplication.class);
    }
}
