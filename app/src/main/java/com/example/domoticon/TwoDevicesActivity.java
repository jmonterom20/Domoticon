package com.example.domoticon;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domoticon.databinding.ActivityMainBinding;
import com.example.domoticon.databinding.ActivityTwoDevicesBinding;

public class TwoDevicesActivity extends AppCompatActivity {
    ActivityTwoDevicesBinding binding;

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two_devices);

        binding = ActivityTwoDevicesBinding .inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
