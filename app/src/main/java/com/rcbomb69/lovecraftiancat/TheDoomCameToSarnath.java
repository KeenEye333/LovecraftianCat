package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.thedoomcametosarnath.TheDoomCameToSarnathFragment;

public class TheDoomCameToSarnath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_doom_came_to_sarnath_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TheDoomCameToSarnathFragment.newInstance())
                    .commitNow();
        }
    }
}
