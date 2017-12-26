package com.okhttp.c1;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class GetExample {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    void syncRun(String url) throws Exception {
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
            }
        });

    }

    public static void main(String[] args) throws Exception {
        GetExample example = new GetExample();
        /*String response = example.run("https://raw.github.com/square/okhttp/master/README.md");
        System.out.println(response);*/
        example.syncRun("https://raw.github.com/square/okhttp/master/README.md");
        //1. okhttp 优缺点，和httpClient对比
        //2. 高级特性。














    }
}