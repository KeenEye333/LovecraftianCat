package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.theterribleoldman.TheTerribleOldManFragment;

public class TheTerribleOldMan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_terrible_old_man_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TheTerribleOldManFragment.newInstance())
                    .commitNow();
        }
    }
}
