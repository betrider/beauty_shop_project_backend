package com.shop.beauty.api.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityModel {
    private String name;
    private int population;
    private int altitude;
}
