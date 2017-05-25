/*
package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

*/
/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 *//*


public class DataLoader {
    //    private FlowerApi api;
    private RestManager manager;
    private final ResposneListener listener;

    public DataLoader(ResposneListener listener) {
        this.listener = listener;
    }

    public void load() {
        manager = new RestManager();
        Call<JsonObject> call = manager.getmFlowerApi().getFlowerDetail();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonArray data = response.body().get("").getAsJsonArray();
                List<Flower> gifs = new ArrayList<>();
                for (int i = 0; i < data.size(); i++) {
                    JsonObject json = data.get(i).getAsJsonObject();
                    gifs.add(new Flower(json));
                }
                listener.onSuccess(gifs);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                listener.onFailure(t);
            }
        });
    }

    public interface ResposneListener {
        void onSuccess(List<Flower> gifs);

        void onFailure(Throwable t);
    }
}
*/
