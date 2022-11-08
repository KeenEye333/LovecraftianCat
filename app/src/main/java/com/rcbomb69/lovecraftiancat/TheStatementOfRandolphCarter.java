package com.rcbomb69.lovecraftiancat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rcbomb69.lovecraftiancat.ui.thestatementofrandolphcarter.TheStatementOfRandolphCarterFragment;

public class TheStatementOfRandolphCarter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_statement_of_randolph_carter_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TheStatementOfRandolphCarterFragment.newInstance())
                    .commitNow();
        }
    }
}
