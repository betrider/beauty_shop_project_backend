package com.shop.beauty.api.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScheduleModel {
    private int id;
    private String title;
    private String startDate;
    private String endDate;
    private String allDay;
    private int priorityId;
    private String rRule;
    private String notes;
    private String exDate;
}
