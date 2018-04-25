package com.alibaba.brain.service.impl;

import com.alibaba.brain.mapper.CityPostureMapper;
import com.alibaba.brain.model.CityPosture;
import com.alibaba.brain.query.CityPostureQuery;
import com.alibaba.brain.service.CityPostureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by zhu.ya.yun  2018/4/23
 */
@Service
public class CityPostureServiceImpl implements CityPostureService {


    @Autowired
    private CityPostureMapper cityPostureMapper;

    @Override
    public List<CityPosture> selectList() {
        return cityPostureMapper.selectById(null);
    }

    @Override
    public List<CityPosture> queryCityPosture(CityPostureQuery cityPosture) {


        return cityPostureMapper.queryCityPosture(cityPosture);
    }
}
