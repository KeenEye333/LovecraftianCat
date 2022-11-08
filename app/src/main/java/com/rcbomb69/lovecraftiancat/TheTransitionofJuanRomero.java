package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.thetransitionofjuanromero.TheTransitionofJuanRomeroFragment;

public class TheTransitionofJuanRomero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_transitionof_juan_romero_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TheTransitionofJuanRomeroFragment.newInstance())
                    .commitNow();
        }
    }
}
