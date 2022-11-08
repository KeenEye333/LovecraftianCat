package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.tomb.TombFragment;

public class Tomb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tomb_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TombFragment.newInstance())
                    .commitNow();
        }
    }
}
