package com.example.domoticon;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domoticon.databinding.ActivityThreeDevicesBinding;

public class ThreeDevicesActivity extends AppCompatActivity {
    ActivityThreeDevicesBinding binding;

    private boolean isBombilla1Encendida = false;
    private boolean isBombilla2Encendida = false;
    private boolean isBombilla3Encendida = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two_devices);

        binding = ActivityThreeDevicesBinding .inflate(getLayoutInflater());
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
        binding.buttonBombilla3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    binding.imageBombilla3.setImageResource(R.drawable.encendido);
                } else {
                    binding.imageBombilla3.setImageResource(R.drawable.apagado);
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
                if (binding.checkBombilla3.isChecked()) {
                    if (isBombilla3Encendida) {
                        binding.imageBombilla3.setImageResource(R.drawable.apagado);
                        binding.buttonBombilla3.setChecked(false);
                        isBombilla3Encendida = false;
                    } else {
                        binding.imageBombilla3.setImageResource(R.drawable.encendido);
                        binding.buttonBombilla3.setChecked(true);
                        isBombilla3Encendida = true;
                    }
                }
            }
        });
    }
}
