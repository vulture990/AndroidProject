package com.zarkaoui.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zarkaoui.androidproject.databinding.ActivityDashboardBinding;
import com.zarkaoui.androidproject.databinding.ActivityProfileBinding;

public class DashboardActivity extends DrawerBaseActivity {

    ActivityDashboardBinding activityDashboardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashboardBinding = ActivityDashboardBinding.inflate(getLayoutInflater());

        setContentView(activityDashboardBinding.getRoot());
        activityTitle("Dashboard");
    }

}