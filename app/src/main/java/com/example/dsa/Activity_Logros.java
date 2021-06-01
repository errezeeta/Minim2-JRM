package com.example.dsa;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.dsa.databinding.ActivityLogrosBinding;

public class Activity_Logros extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityLogrosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logros);

    }

    public void clickVolver (View view) {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}