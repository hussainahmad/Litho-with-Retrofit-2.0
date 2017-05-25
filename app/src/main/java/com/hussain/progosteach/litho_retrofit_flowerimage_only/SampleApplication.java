package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.soloader.SoLoader;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */

public class SampleApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /*Fresco.initialize(this);*/
        SoLoader.init(this, false);
    }
}
