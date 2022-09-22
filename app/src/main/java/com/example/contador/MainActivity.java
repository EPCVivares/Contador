package com.example.contador;

import android.app.Activity;
import android.os.Bundle;

import androidx.navigation.ui.AppBarConfiguration;


import com.example.contador.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }


}