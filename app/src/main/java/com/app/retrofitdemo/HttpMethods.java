package com.app.retrofitdemo;

import android.util.Log;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpMethods {

    private static final String BASE_URL = "https://api.douban.com/v2/movie/";
    private ApiService apiService;


    private HttpMethods() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

    }

    private static class singleInstance {
        public static final HttpMethods instance = new HttpMethods();
    }


    public static HttpMethods getInstance() {
        return singleInstance.instance;
    }

    public void getJoke() {
        Log.e("avvds", "00000000000000000");
        apiService.getTopMovie(0, 10)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Movie>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("avvds", "onSubscribe = ");
                    }

                    @Override
                    public void onNext(Movie movie) {
                        Log.e("avvds", "title = " + movie.getTitle());
                        for (int i = 0; i < movie.getSubjects().size(); i++) {
                            Log.e("avvds", "title = " + movie.getSubjects().get(i).getTitle());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("avvds", "onError = ");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("avvds", "onComplete = ");
                    }
                });
    }


}
