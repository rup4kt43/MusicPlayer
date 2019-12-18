package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("cover")
    private String cover;

    @SerializedName("tracklist")
    private String tracklist;

    @SerializedName("cover_xl")
    private String coverXl;

    @SerializedName("cover_medium")
    private String coverMedium;

    @SerializedName("cover_small")
    private String coverSmall;

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private String type;

    @SerializedName("cover_big")
    private String coverBig;

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover() {
        return cover;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setCoverXl(String coverXl) {
        this.coverXl = coverXl;
    }

    public String getCoverXl() {
        return coverXl;
    }

    public void setCoverMedium(String coverMedium) {
        this.coverMedium = coverMedium;
    }

    public String getCoverMedium() {
        return coverMedium;
    }

    public void setCoverSmall(String coverSmall) {
        this.coverSmall = coverSmall;
    }

    public String getCoverSmall() {
        return coverSmall;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCoverBig(String coverBig) {
        this.coverBig = coverBig;
    }

    public String getCoverBig() {
        return coverBig;
    }

    @Override
    public String toString() {
        return
                "Album{" +
                        "cover = '" + cover + '\'' +
                        ",tracklist = '" + tracklist + '\'' +
                        ",cover_xl = '" + coverXl + '\'' +
                        ",cover_medium = '" + coverMedium + '\'' +
                        ",cover_small = '" + coverSmall + '\'' +
                        ",id = '" + id + '\'' +
                        ",title = '" + title + '\'' +
                        ",type = '" + type + '\'' +
                        ",cover_big = '" + coverBig + '\'' +
                        "}";
    }
}