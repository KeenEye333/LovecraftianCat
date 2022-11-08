package com.rcbomb69.lovecraftiancat.ui.thewallofsleep;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rcbomb69.lovecraftiancat.R;

public class TheWallOfSleepFragment extends Fragment {

    private TheWallOfSleepViewModel mViewModel;

    public static TheWallOfSleepFragment newInstance() {
        return new TheWallOfSleepFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.the_wall_of_sleep_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TheWallOfSleepViewModel.class);
        // TODO: Use the ViewModel
    }

}
