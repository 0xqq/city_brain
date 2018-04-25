package com.alibaba.brain.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;


/**
 * 城市态势
 */
public class CityPosture {

    /**
     * 自动编号
     */
    private Long id;

    /**
     * 车牌
     */
    private String vehicleId;

    /**
     * 进入时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date entryTime;

    /**
     * 离开时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date leaveTime;

    /**
     * 车辆类型
     */
    private String vehicleType;

    /**
     * 相机id
     */
    private String cameraId;

    /**
     * 相机点位
     */
    private String cameraPosition;

    /**
     * 方向id 东南西北 0123
     */
    private Integer directionId;

    /**
     * 道路id
     */
    private Integer roadId;

    /**
     * id 左转弯1 直行2 右转弯 3
     */
    private Integer turnId;

    /**
     * 日期
     */
    private String dateString;

    /**
     * 注释
     */
    private String memo;

    /**
     * 车辆图片id
     */
    private String crossUrl;

    /**
     * 图片路径
     */
    private String fullOssUrl;

    /**
     * 事件id
     */
    private String eventId;

    /**
     * 事件类型
     */
    private String eventType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getCameraPosition() {
        return cameraPosition;
    }

    public void setCameraPosition(String cameraPosition) {
        this.cameraPosition = cameraPosition;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public Integer getTurnId() {
        return turnId;
    }

    public void setTurnId(Integer turnId) {
        this.turnId = turnId;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCrossUrl() {
        return crossUrl;
    }

    public void setCrossUrl(String crossUrl) {
        this.crossUrl = crossUrl;
    }

    public String getFullOssUrl() {
        return fullOssUrl;
    }

    public void setFullOssUrl(String fullOssUrl) {
        this.fullOssUrl = fullOssUrl;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}