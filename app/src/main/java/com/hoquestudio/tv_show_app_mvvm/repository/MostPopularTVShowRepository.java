package com.hoquestudio.tv_show_app_mvvm.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.hoquestudio.tv_show_app_mvvm.networks.ApiClient;
import com.hoquestudio.tv_show_app_mvvm.networks.ApiService;
import com.hoquestudio.tv_show_app_mvvm.response.TvShowResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTVShowRepository {

    private ApiService apiService;

    public MostPopularTVShowRepository(){
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TvShowResponse> getMostPopularTvShow(int page){
        MutableLiveData<TvShowResponse> mutableLiveData = new MutableLiveData<>();

        apiService.getTvResponse(page).enqueue(new Callback<TvShowResponse>() {
            @Override
            public void onResponse(Call<TvShowResponse> call, Response<TvShowResponse> response) {

                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<TvShowResponse> call, Throwable t) {
                mutableLiveData.setValue(null);
            }
        });

        return mutableLiveData;
    }
}
