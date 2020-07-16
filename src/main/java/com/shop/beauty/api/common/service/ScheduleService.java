package com.shop.beauty.api.common.service;

import com.shop.beauty.api.common.mapper.ScheduleMapper;
import com.shop.beauty.api.common.model.ScheduleModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScheduleService {

    @Resource
    ScheduleMapper scheduleMapper;

    public List<ScheduleModel> getAllSchedule() throws Exception {
        return (List<ScheduleModel>) scheduleMapper.selectAllSchedule();
    }
}
