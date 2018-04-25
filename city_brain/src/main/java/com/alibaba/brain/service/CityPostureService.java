package com.alibaba.brain.service;

import com.alibaba.brain.model.CityPosture;
import com.alibaba.brain.query.CityPostureQuery;

import java.util.List;

/**
 * Create by zhu.ya.yun  2018/4/23
 */
public interface CityPostureService {

    /**
     * 查询所有数据列表
     *
     * @return
     */
    List<CityPosture> selectList();

    /**
     * 查询姿态数据信息
     *
     * @param cityPostureQuery
     * @return
     */
    List<CityPosture> queryCityPosture(CityPostureQuery cityPostureQuery);
}
