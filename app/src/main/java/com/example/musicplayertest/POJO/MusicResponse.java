package com.example.musicplayertest.POJO;

import com.google.gson.annotations.SerializedName;

public class MusicResponse {

    @SerializedName("nb_tracks")
    private int nbTracks;

    @SerializedName("picture_xl")
    private String pictureXl;

    @SerializedName("tracklist")
    private String tracklist;

    @SerializedName("creator")
    private Creator creator;

    @SerializedName("collaborative")
    private boolean collaborative;

    @SerializedName("link")
    private String link;

    @SerializedName("picture_small")
    private String pictureSmall;

    @SerializedName("description")
    private String description;

    @SerializedName("creation_date")
    private String creationDate;

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private String type;

    @SerializedName("picture")
    private String picture;

    @SerializedName("tracks")
    private Tracks tracks;

    @SerializedName("fans")
    private int fans;

    @SerializedName("duration")
    private int duration;

    @SerializedName("is_loved_track")
    private boolean isLovedTrack;

    @SerializedName("public")
    private boolean jsonMemberPublic;

    @SerializedName("picture_big")
    private String pictureBig;

    @SerializedName("checksum")
    private String checksum;

    @SerializedName("share")
    private String share;

    @SerializedName("id")
    private int id;

    @SerializedName("picture_medium")
    private String pictureMedium;

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
    }

    public int getNbTracks() {
        return nbTracks;
    }

    public void setPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
    }

    public String getPictureXl() {
        return pictureXl;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCollaborative(boolean collaborative) {
        this.collaborative = collaborative;
    }

    public boolean isCollaborative() {
        return collaborative;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
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

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public int getFans() {
        return fans;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setIsLovedTrack(boolean isLovedTrack) {
        this.isLovedTrack = isLovedTrack;
    }

    public boolean isIsLovedTrack() {
        return isLovedTrack;
    }

    public void setJsonMemberPublic(boolean jsonMemberPublic) {
        this.jsonMemberPublic = jsonMemberPublic;
    }

    public boolean isJsonMemberPublic() {
        return jsonMemberPublic;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getShare() {
        return share;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public String getPictureMedium() {
        return pictureMedium;
    }

    @Override
    public String toString() {
        return
                "MusicResponse{" +
                        "nb_tracks = '" + nbTracks + '\'' +
                        ",picture_xl = '" + pictureXl + '\'' +
                        ",tracklist = '" + tracklist + '\'' +
                        ",creator = '" + creator + '\'' +
                        ",collaborative = '" + collaborative + '\'' +
                        ",link = '" + link + '\'' +
                        ",picture_small = '" + pictureSmall + '\'' +
                        ",description = '" + description + '\'' +
                        ",creation_date = '" + creationDate + '\'' +
                        ",title = '" + title + '\'' +
                        ",type = '" + type + '\'' +
                        ",picture = '" + picture + '\'' +
                        ",tracks = '" + tracks + '\'' +
                        ",fans = '" + fans + '\'' +
                        ",duration = '" + duration + '\'' +
                        ",is_loved_track = '" + isLovedTrack + '\'' +
                        ",public = '" + jsonMemberPublic + '\'' +
                        ",picture_big = '" + pictureBig + '\'' +
                        ",checksum = '" + checksum + '\'' +
                        ",share = '" + share + '\'' +
                        ",id = '" + id + '\'' +
                        ",picture_medium = '" + pictureMedium + '\'' +
                        "}";
    }
}