package com.hoquestudio.tv_show_app_mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.hoquestudio.tv_show_app_mvvm.repository.MostPopularTVShowRepository;
import com.hoquestudio.tv_show_app_mvvm.response.TvShowResponse;

public class MostPopularTvShowViewModel extends ViewModel {

    private MostPopularTVShowRepository mostPopularTVShowRepository;
    public MostPopularTvShowViewModel(){
        mostPopularTVShowRepository = new MostPopularTVShowRepository();
    }
    public LiveData<TvShowResponse> getMostPopularTvShow(int page){
        return mostPopularTVShowRepository.getMostPopularTvShow(page);
    }
}
