package com.example.mystargram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OBGRqZUvqVmcQZDwV3WQkj9asbP9flembVcECdR1")
                .clientKey("GXedqpXEbBOB4OZOLoURWYi3s3BcUIgz8oysvd2I")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
