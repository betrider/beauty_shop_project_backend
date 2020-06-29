package com.shop.beauty.api.common.mapper;

import com.shop.beauty.api.common.model.CityModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*@Mapper
@Repository*/
public interface CityMapper {
    List<CityModel> selectAllCity() throws Exception;
}
