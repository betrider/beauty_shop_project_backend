package com.shop.beauty.api.common.controller;

import com.shop.beauty.api.common.model.CityModel;
import com.shop.beauty.api.common.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @GetMapping("/api/schedule/get")
    public ArrayList test2() throws Exception {

        ArrayList aa = new ArrayList();

        HashMap hMap =new HashMap();
        hMap.put("title","말티즈 미용");
        hMap.put("priorityId",1);
        hMap.put("startDate","20200611090000");
        hMap.put("endDate","20200611120000");
        aa.add(hMap);

        hMap =new HashMap();
        hMap.put("title","포메라니안 미용");
        hMap.put("priorityId",2);
        hMap.put("startDate","20200611100000");
        hMap.put("endDate","20200611130000");
        aa.add(hMap);

        return aa;
    }

}
