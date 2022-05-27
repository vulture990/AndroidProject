package com.zarkaoui.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zarkaoui.androidproject.databinding.ActivityDrawerBaseBinding;
import com.zarkaoui.androidproject.databinding.ActivityProfileBinding;

public class ProfileActivity extends DrawerBaseActivity {

    ActivityProfileBinding activityProfileBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityProfileBinding = ActivityProfileBinding.inflate(getLayoutInflater());

        setContentView(activityProfileBinding.getRoot());
        activityTitle("Profile");
    }
}