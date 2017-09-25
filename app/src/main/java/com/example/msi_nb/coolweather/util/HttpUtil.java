package com.example.msi_nb.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 和服务器进行交互的类
 * Created by MSI-NB on 2017/9/22.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
