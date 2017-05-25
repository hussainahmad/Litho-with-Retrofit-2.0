package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.OrientationHelper;
import android.util.Log;
import android.view.Display;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentInfo;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LinearLayoutInfo;
import com.facebook.litho.widget.Recycler;
import com.facebook.litho.widget.RecyclerBinder;
import com.google.gson.JsonObject;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RestManager manager;
    private Flower mFlower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext context = new ComponentContext(this);
        final RecyclerBinder recyclerBinder = new RecyclerBinder(
                context,
                new LinearLayoutInfo(this, OrientationHelper.VERTICAL, false));

        final Component component = Recycler.create(context)
                .binder(recyclerBinder)
                .build();
        addContent(recyclerBinder, context);
        setContentView(LithoView.create(context, component));
    }
    private void addContent(
            final RecyclerBinder recyclerBinder,
            final ComponentContext context){
        manager = new RestManager();
        Call<List<Flower>> call = manager.getmFlowerApi().getFlowerDetail();
        call.enqueue(new Callback<List<Flower>>() {
            @Override
            public void onResponse(Call<List<Flower>> call, Response<List<Flower>> response) {
                Log.i("Error Not Found", response.toString());
                String data = response.body().toString();
                Log.i("error not found", data);
                List<Flower> gifs = response.body();
                Display display = getWindowManager().getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                int width = size.x;
                int width1 = ((width) / 2) - 10;
                int height = size.y;
                int height1 = (int) (width1 / 0.699);
                Log.i("width", width1 + "");
                Log.i("width (height)", height1 + "");
                for (int i = 0; i < gifs.size(); i++) {
                    Log.i("Total data string is", gifs.toString());
                    Flower flower = gifs.get(i);
                    Log.i("Flower", flower.getPhoto());
                    /*JsonObject json = data.get(i).getAsJsonObject();
                    gifs.add)*/
                    ComponentInfo.Builder componentInfoBuilder = ComponentInfo.create();
                    componentInfoBuilder.component(
                            ListItem.create(context)
                                    .color(Color.WHITE )
                                    .width(width1)
                                    .height(height1)
                                    .uriImage(ConstantClass.Http.FLOWER_URL+flower.getPhoto())
                                    .cPrice(flower.getName() +" & Price:"+flower.getPrice())
                                    .instruction(flower.getInstructions())
                                    .build());
                    recyclerBinder.insertItemAt(i, componentInfoBuilder.build());
                }
            }

            @Override
            public void onFailure(Call<List<Flower>> call, Throwable t) {
                t.printStackTrace();
                Log.i("Error",t.getLocalizedMessage());
            }
        });

    }
}
