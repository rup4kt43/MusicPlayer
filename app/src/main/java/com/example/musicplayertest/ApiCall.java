package com.example.musicplayertest;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.musicplayertest.POJO.MusicResponse;
import com.google.gson.Gson;

public class ApiCall {


    private final MainActivity context;
    String url = "https://api.deezer.com/playlist/908622995";


    public ApiCall(MainActivity mainActivity) {
        this.context = mainActivity;
    }


    public void retriveMusic() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                MusicResponse musicResponse = new Gson().fromJson(response, MusicResponse.class);
                context.playMusic(musicResponse);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(stringRequest);
    }
}
