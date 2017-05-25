package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */

public interface FlowerApi {
    @GET("/feeds/flowers.json")
   Call<List<Flower>> getFlowerDetail();
//    Call<List<Flower>> getAllflower();
}
