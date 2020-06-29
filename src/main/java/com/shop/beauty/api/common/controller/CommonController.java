package com.shop.beauty.api.common.controller;

import com.shop.beauty.api.common.model.CityModel;
import com.shop.beauty.api.common.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class CommonController {

    @Resource(name = "cityService")
    private CityService cityService;

    @GetMapping("/api/test")
    public HashMap test() throws Exception {

        HashMap hMap =new HashMap();

        List<CityModel> list =  cityService.getAllCity();

        for(CityModel city : list){
            hMap.put("name",city.getName());
            hMap.put("altitude",city.getAltitude());
            hMap.put("message","안녕하세요123");
        }

        return hMap;
    }

}
