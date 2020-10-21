package com.example.mystargram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OBGRqZUvqVmcQZDwV3WQkj9asbP9flembVcECdR1")
                .clientKey("GXedqpXEbBOB4OZOLoURWYi3s3BcUIgz8oysvd2I")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
