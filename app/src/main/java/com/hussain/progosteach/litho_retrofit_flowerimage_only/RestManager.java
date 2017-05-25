package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */

public class RestManager {
    private FlowerApi mFlowerApi;
    public FlowerApi getmFlowerApi(){
        if(mFlowerApi==null){
            Retrofit mretrofit  = new Retrofit.Builder()
                    .baseUrl(ConstantClass.Http.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mFlowerApi = mretrofit.create(FlowerApi.class);
        }
        return  mFlowerApi;
    }
}
