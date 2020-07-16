package com.shop.beauty.api.common.controller;

import com.shop.beauty.api.common.model.CityModel;
import com.shop.beauty.api.common.model.ScheduleModel;
import com.shop.beauty.api.common.service.CityService;
import com.shop.beauty.api.common.service.ScheduleService;
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

    @Resource(name = "scheduleService")
    private ScheduleService scheduleService;

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

    @GetMapping("/api/test11")
    public HashMap test11() throws Exception {

        HashMap hMap =new HashMap();

        List<ScheduleModel> list =  scheduleService.getAllSchedule();

        for(ScheduleModel schedule : list){
            hMap.put("id",schedule.getId());
            hMap.put("title",schedule.getTitle());
            hMap.put("startdate",schedule.getStartdate());
            hMap.put("enddate",schedule.getEnddate());
            hMap.put("allday",schedule.getAllday());
            hMap.put("priorityid",schedule.getPriorityid());
            hMap.put("rrule",schedule.getRrule());
            hMap.put("notes",schedule.getNotes());
            hMap.put("exdate",schedule.getExdate());
        }

        return hMap;
    }

    @GetMapping("/api/schedule/get")
    public ArrayList test2() throws Exception {

        ArrayList aa = new ArrayList();

        HashMap hMap =new HashMap();
        hMap.put("title","말티즈 미용11");
        hMap.put("priorityId",1);
        //hMap.put("startDate","20200613100000");
        //hMap.put("endDate","20200613130000");
        hMap.put("startDate","Mon Jul 14 2020 09:00:00 GMT+0900 (대한민국 표준시)");
        hMap.put("endDate","Mon Jul 14 2020 09:30:00 GMT+0900 (대한민국 표준시)");
        hMap.put("id",1);
        aa.add(hMap);

        hMap =new HashMap();
        hMap.put("title","포메라니안 미용22");
        hMap.put("priorityId",2);
        //hMap.put("startDate","20200613100000");
        //hMap.put("endDate","20200613130000");
        hMap.put("startDate","Mon Jul 14 2020 09:00:00 GMT+0900 (대한민국 표준시)");
        hMap.put("endDate","Mon Jul 14 2020 09:30:00 GMT+0900 (대한민국 표준시)");
        hMap.put("id",2);
        aa.add(hMap);

        return aa;
    }

}
