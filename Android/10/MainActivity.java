package com.example.birthdaycard;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.birthdaycard.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView i1, i2,i3,i4,i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = (ImageView) findViewById(R.id.img1);
        i2 = (ImageView) findViewById(R.id.img2);
        i3 = (ImageView) findViewById(R.id.img3);
        i4 = (ImageView) findViewById(R.id.img4);
        i5 = (ImageView) findViewById(R.id.img5);
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img1) {
            i1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);


        }
        if (view.getId() == R.id.img2) {
            i2.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
        }
        if (view.getId() == R.id.img3) {
            i3.setVisibility(View.GONE);
            i4.setVisibility(View.VISIBLE);
        }
        if (view.getId() == R.id.img4) {
            i4.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
        }
    }
}
