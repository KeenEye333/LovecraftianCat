package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.dagon.DagonFragment;

public class dagon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagon_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, DagonFragment.newInstance())
                    .commitNow();
        }
    }
}
