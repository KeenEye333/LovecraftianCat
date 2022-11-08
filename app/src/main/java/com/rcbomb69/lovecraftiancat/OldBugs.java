package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.oldbugs.OldBugsFragment;

public class OldBugs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.old_bugs_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, OldBugsFragment.newInstance())
                    .commitNow();
        }
    }
}
