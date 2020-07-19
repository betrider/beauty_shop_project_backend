package com.shop.beauty.api.common.controller;

import com.shop.beauty.api.common.model.CityModel;
import com.shop.beauty.api.common.model.ScheduleModel;
import com.shop.beauty.api.common.service.CityService;
import com.shop.beauty.api.common.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/schedule/get")
    public ArrayList searchSchedule() throws Exception {

        ArrayList arrList = new ArrayList();
        HashMap hMap =new HashMap();

        List<ScheduleModel> list =  scheduleService.getAllSchedule();
        for(ScheduleModel schedule : list){
            hMap = new HashMap();
            hMap.put("id",schedule.getId());
            hMap.put("title",schedule.getTitle());
            hMap.put("startDate",schedule.getStartDate());
            hMap.put("endDate",schedule.getEndDate());
            hMap.put("allDay",Boolean.parseBoolean(schedule.getAllDay()));
            hMap.put("priorityId",schedule.getPriorityId());
            hMap.put("rRule",schedule.getRRule());
            hMap.put("notes",schedule.getNotes());
            hMap.put("exDate",schedule.getExDate());
            arrList.add(hMap);
        }

        return arrList;
    }

    @RequestMapping("/api/schedule/delete/id/{id}")
    public void deleteSchedule(@PathVariable int id) throws Exception {
        scheduleService.deleteSchedule(id);
    }

    @PostMapping("/api/schedule/post")
    public String insertSchedule(@RequestBody ScheduleModel model) throws Exception {
        scheduleService.insertSchedule(model);
        return "insertSchedule";
    }

    @PostMapping("/api/schedule/put")
    public String updateSchedule(@RequestBody ScheduleModel model) throws Exception {
        scheduleService.updateSchedule(model);
        return "updateSchedule";
    }
}
