package com.shop.beauty.api.common.service;

import com.shop.beauty.api.common.mapper.CityMapper;
import com.shop.beauty.api.common.model.CityModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {

    @Resource
    CityMapper cityMapper;

    public List<CityModel> getAllCity() throws Exception {
        return (List<CityModel>) cityMapper.selectAllCity();
    }
}
