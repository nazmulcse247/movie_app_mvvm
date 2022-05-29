package com.hoquestudio.tv_show_app_mvvm.networks;

import com.hoquestudio.tv_show_app_mvvm.models.TvShow;
import com.hoquestudio.tv_show_app_mvvm.response.TvShowResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("most-popular")
    Call<TvShowResponse> getTvResponse(@Query("page") int page);
}
