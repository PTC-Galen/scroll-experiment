package com.galen.importantbusinessproject;

import android.annotation.SuppressLint;
import android.util.Log;

import androidx.annotation.WorkerThread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CatRequestBuilder {
    private static final String BASE_URL = "https://placekitten.com/";
    @SuppressLint("DefaultLocale")
    public static String formatRequest(int width, int height) {
        return BASE_URL + String.format("%d/%d", width, height);
    }
}
