package com.restaurant.search.newbierob;
import okhttp3.Callback;
import okhttp3.OkHttpClient;

public class YummlyService {
    public static void findRecipes(String location, Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();

    }
}
