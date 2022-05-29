package com.hoquestudio.tv_show_app_mvvm.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TvShow {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("permalink")
    private String permalink;
    @SerializedName("start_date")
    private String startDate;
    @SerializedName("country")
    private String country;
    @SerializedName("network")
    private String network;
    @SerializedName("image_thumbnail_path")
    private String image_thumbnail_path;

    public TvShow(int id, String name, String permalink, String startDate, String country, String network, String image_thumbnail_path) {
        this.id = id;
        this.name = name;
        this.permalink = permalink;
        this.startDate = startDate;
        this.country = country;
        this.network = network;
        this.image_thumbnail_path = image_thumbnail_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getImage_thumbnail_path() {
        return image_thumbnail_path;
    }

    public void setImage_thumbnail_path(String image_thumbnail_path) {
        this.image_thumbnail_path = image_thumbnail_path;
    }
}
