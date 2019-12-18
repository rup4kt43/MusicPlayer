package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

public class Artist {

    @SerializedName("tracklist")
    private String tracklist;

    @SerializedName("name")
    private String name;

    @SerializedName("link")
    private String link;

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

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
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
                "Artist{" +
                        "tracklist = '" + tracklist + '\'' +
                        ",name = '" + name + '\'' +
                        ",link = '" + link + '\'' +
                        ",id = '" + id + '\'' +
                        ",type = '" + type + '\'' +
                        "}";
    }
}