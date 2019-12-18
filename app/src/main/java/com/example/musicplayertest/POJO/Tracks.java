package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tracks {

    @SerializedName("data")
    private List<DataItem> data;

    @SerializedName("checksum")
    private String checksum;

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public List<DataItem> getData() {
        return data;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getChecksum() {
        return checksum;
    }

    @Override
    public String toString() {
        return
                "Tracks{" +
                        "data = '" + data + '\'' +
                        ",checksum = '" + checksum + '\'' +
                        "}";
    }
}