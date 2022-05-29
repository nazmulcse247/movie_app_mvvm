package com.hoquestudio.tv_show_app_mvvm.response;

import com.google.gson.annotations.SerializedName;
import com.hoquestudio.tv_show_app_mvvm.models.TvShow;

import java.util.List;

public class TvShowResponse {

    @SerializedName("total")
    private String total;
    @SerializedName("page")
    private int page;
    @SerializedName("pages")
    private int pages;
    @SerializedName("tv_shows")
    private List<TvShow> tvShow;

    public TvShowResponse(String total, int page, int pages,List<TvShow> tvShow) {
        this.total = total;
        this.page = page;
        this.pages = pages;
        this.tvShow = tvShow;
    }

    public String getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getPages() {
        return pages;
    }

    public List<TvShow> getTvShow(){
        return tvShow;
    }
}
