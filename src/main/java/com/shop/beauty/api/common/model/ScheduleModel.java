package com.shop.beauty.api.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScheduleModel {
    private int id;
    private String title;
    private String startdate;
    private String enddate;
    private String allday;
    private int priorityid;
    private String rrule;
    private String notes;
    private String exdate;
}
