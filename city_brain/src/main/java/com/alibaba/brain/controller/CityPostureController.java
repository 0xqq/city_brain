package com.alibaba.brain.controller;

import com.alibaba.brain.model.CityPosture;
import com.alibaba.brain.query.CityPostureQuery;
import com.alibaba.brain.service.CityPostureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 城市态势
 */

@RestController
public class CityPostureController {


    @Autowired
    private CityPostureService cityPostureService;


    @RequestMapping("/city")
    public PageInfo getCityPosture(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CityPosture> cityPostures = cityPostureService.selectList();
        PageInfo page = new PageInfo(cityPostures, 10);
        return page;
    }


    /**
     * 通过查询信息查询城市姿态数据
     */
    @RequestMapping("/postureList")
    public PageInfo getCityPostureList(CityPostureQuery cityPostureQuery) {
        PageHelper.startPage(cityPostureQuery.getPageNum(), cityPostureQuery.getPageSize());
        List<CityPosture> cityPostureList = cityPostureService.queryCityPosture(cityPostureQuery);
        PageInfo pageInfo = new PageInfo(cityPostureList);
        return pageInfo;
    }
}
