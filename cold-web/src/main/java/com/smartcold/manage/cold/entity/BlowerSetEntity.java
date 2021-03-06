package com.smartcold.manage.cold.entity;

import java.util.Date;

/**
 * Author: qiunian.sun
 * Date: qiunian.sun(2016-03-19 11:53)
 */
public class BlowerSetEntity {

    private int id;

    private int blowerId;

    private int compressorGroupId;

    private int coldStorageId;

    private float defrostingTemperature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlowerId() {
        return blowerId;
    }

    public void setBlowerId(int blowerId) {
        this.blowerId = blowerId;
    }

    public int getCompressorGroupId() {
        return compressorGroupId;
    }

    public void setCompressorGroupId(int compressorGroupId) {
        this.compressorGroupId = compressorGroupId;
    }

    public int getColdStorageId() {
        return coldStorageId;
    }

    public void setColdStorageId(int coldStorageId) {
        this.coldStorageId = coldStorageId;
    }

    public float getDefrostingTemperature() {
        return defrostingTemperature;
    }

    public void setDefrostingTemperature(float defrostingTemperature) {
        this.defrostingTemperature = defrostingTemperature;
    }
}
