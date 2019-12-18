package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

public class Creator {

    @SerializedName("tracklist")
    private String tracklist;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private String type;

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "Creator{" +
                        "tracklist = '" + tracklist + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}