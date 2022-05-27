package com.zarkaoui.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zarkaoui.androidproject.databinding.ActivityNutritionBinding;

public class NutritionActivity extends DrawerBaseActivity {

    ActivityNutritionBinding activityNutritionBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNutritionBinding = ActivityNutritionBinding.inflate(getLayoutInflater());
        setContentView(activityNutritionBinding.getRoot());
        activityTitle("Nutrition");
    }
}