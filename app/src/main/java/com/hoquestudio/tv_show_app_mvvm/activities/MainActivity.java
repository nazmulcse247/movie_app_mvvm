package com.hoquestudio.tv_show_app_mvvm.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import com.hoquestudio.tv_show_app_mvvm.R;
import com.hoquestudio.tv_show_app_mvvm.viewmodel.MostPopularTvShowViewModel;

public class MainActivity extends AppCompatActivity {
    private MostPopularTvShowViewModel mostPopularTvShowViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostPopularTvShowViewModel = new ViewModelProvider(this).get(MostPopularTvShowViewModel.class);
        getPopularTvShow();
    }

    private void getPopularTvShow() {
        mostPopularTvShowViewModel.getMostPopularTvShow(0)
                .observe(this, mostPopularTvShowResponse ->
                        Toast.makeText(this, mostPopularTvShowResponse.getTvShow().get(0).getName(), Toast.LENGTH_SHORT).show()
                );
    }
}