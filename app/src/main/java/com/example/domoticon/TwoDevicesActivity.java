package com.example.domoticon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.domoticon.databinding.ActivityMainBinding;
import com.example.domoticon.databinding.ActivityTwoDevicesBinding;

public class TwoDevicesActivity extends AppCompatActivity {
    ActivityTwoDevicesBinding binding;

    private boolean isBombilla1Encendida = false;
    private boolean isBombilla2Encendida = false;

    public static final String ESTADO_BOMBILLA_1 = "Bombilla 1 apagada";
    public static final String ESTADO_BOMBILLA_2 = "Bombilla 2 apagada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_devices);

        if (savedInstanceState != null) {
            isBombilla1Encendida = savedInstanceState.getBoolean(ESTADO_BOMBILLA_1);
            isBombilla2Encendida = savedInstanceState.getBoolean(ESTADO_BOMBILLA_2);
        }

        binding = ActivityTwoDevicesBinding .inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonBombilla1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    binding.imageBombilla1.setImageResource(R.drawable.encendido);
                } else {
                    binding.imageBombilla1.setImageResource(R.drawable.apagado);
                }
            }
        });
        binding.buttonBombilla2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    binding.imageBombilla2.setImageResource(R.drawable.encendido);
                } else {
                    binding.imageBombilla2.setImageResource(R.drawable.apagado);
                }
            }
        });

        binding.changeBombillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.checkBombilla1.isChecked()) {
                    if (isBombilla1Encendida) {
                        binding.imageBombilla1.setImageResource(R.drawable.apagado);
                        binding.buttonBombilla1.setChecked(false);
                        isBombilla1Encendida = false;
                    } else {
                        binding.imageBombilla1.setImageResource(R.drawable.encendido);
                        binding.buttonBombilla1.setChecked(true);
                        isBombilla1Encendida = true;
                    }
                }
                if (binding.checkBombilla2.isChecked()) {
                    if (isBombilla2Encendida) {
                        binding.imageBombilla2.setImageResource(R.drawable.apagado);
                        binding.buttonBombilla2.setChecked(false);
                        isBombilla2Encendida = false;
                    } else {
                        binding.imageBombilla2.setImageResource(R.drawable.encendido);
                        binding.buttonBombilla2.setChecked(true);
                        isBombilla2Encendida = true;
                    }
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putBoolean(ESTADO_BOMBILLA_1, isBombilla1Encendida);
        savedInstanceState.putBoolean(ESTADO_BOMBILLA_2, isBombilla2Encendida);
        super.onSaveInstanceState(savedInstanceState);
    }
}
