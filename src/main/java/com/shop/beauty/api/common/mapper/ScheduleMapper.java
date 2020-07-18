package com.shop.beauty.api.common.mapper;

import com.shop.beauty.api.common.model.ScheduleModel;

import java.util.List;

/*@Mapper
@Repository*/
public interface ScheduleMapper {
    List<ScheduleModel> selectAllSchedule() throws Exception;
    void insertSchedule(ScheduleModel model) throws Exception;
    void updateSchedule(ScheduleModel model) throws Exception;
    void deleteSchedule(int id) throws Exception;
}
