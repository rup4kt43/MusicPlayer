package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

public class DataItem {

    @SerializedName("readable")
    private boolean readable;

    @SerializedName("preview")
    private String preview;

    @SerializedName("artist")
    private Artist artist;

    @SerializedName("album")
    private Album album;

    @SerializedName("link")
    private String link;

    @SerializedName("explicit_content_cover")
    private int explicitContentCover;

    @SerializedName("title")
    private String title;

    @SerializedName("title_version")
    private String titleVersion;

    @SerializedName("explicit_lyrics")
    private boolean explicitLyrics;

    @SerializedName("type")
    private String type;

    @SerializedName("title_short")
    private String titleShort;

    @SerializedName("duration")
    private int duration;

    @SerializedName("rank")
    private int rank;

    @SerializedName("id")
    private int id;

    @SerializedName("explicit_content_lyrics")
    private int explicitContentLyrics;

    @SerializedName("time_add")
    private int timeAdd;

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    public boolean isReadable() {
        return readable;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getPreview() {
        return preview;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setExplicitContentCover(int explicitContentCover) {
        this.explicitContentCover = explicitContentCover;
    }

    public int getExplicitContentCover() {
        return explicitContentCover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitleVersion(String titleVersion) {
        this.titleVersion = titleVersion;
    }

    public String getTitleVersion() {
        return titleVersion;
    }

    public void setExplicitLyrics(boolean explicitLyrics) {
        this.explicitLyrics = explicitLyrics;
    }

    public boolean isExplicitLyrics() {
        return explicitLyrics;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitleShort(String titleShort) {
        this.titleShort = titleShort;
    }

    public String getTitleShort() {
        return titleShort;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setExplicitContentLyrics(int explicitContentLyrics) {
        this.explicitContentLyrics = explicitContentLyrics;
    }

    public int getExplicitContentLyrics() {
        return explicitContentLyrics;
    }

    public void setTimeAdd(int timeAdd) {
        this.timeAdd = timeAdd;
    }

    public int getTimeAdd() {
        return timeAdd;
    }

    @Override
    public String toString() {
        return
                "DataItem{" +
                        "readable = '" + readable + '\'' +
                        ",preview = '" + preview + '\'' +
                        ",artist = '" + artist + '\'' +
                        ",album = '" + album + '\'' +
                        ",link = '" + link + '\'' +
                        ",explicit_content_cover = '" + explicitContentCover + '\'' +
                        ",title = '" + title + '\'' +
                        ",title_version = '" + titleVersion + '\'' +
                        ",explicit_lyrics = '" + explicitLyrics + '\'' +
                        ",type = '" + type + '\'' +
                        ",title_short = '" + titleShort + '\'' +
                        ",duration = '" + duration + '\'' +
                        ",rank = '" + rank + '\'' +
                        ",id = '" + id + '\'' +
                        ",explicit_content_lyrics = '" + explicitContentLyrics + '\'' +
                        ",time_add = '" + timeAdd + '\'' +
                        "}";
    }
}