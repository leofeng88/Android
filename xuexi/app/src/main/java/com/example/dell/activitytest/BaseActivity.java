package com.example.dell.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2019/6/20.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BaseActiovity",getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    protected void onDestory(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}

