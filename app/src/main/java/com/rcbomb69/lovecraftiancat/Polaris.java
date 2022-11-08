package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.polaris.PolarisFragment;

public class Polaris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polaris_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PolarisFragment.newInstance())
                    .commitNow();
        }
    }
}
