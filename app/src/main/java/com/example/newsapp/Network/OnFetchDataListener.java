package com.example.newsapp.Network;

import com.example.newsapp.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadlines>list,String message);
    void onError(String message);
}
