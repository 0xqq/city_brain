package com.alibaba.brain.mapper;


import com.alibaba.brain.model.CityPosture;
import com.alibaba.brain.query.CityPostureQuery;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CityPostureMapper {


    List<CityPosture> selectById(Long cityId);


    List<CityPosture> queryCityPosture(CityPostureQuery cityPosture);
}