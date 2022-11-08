package com.rcbomb69.lovecraftiancat.ui.theterribleoldman;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rcbomb69.lovecraftiancat.R;

public class TheTerribleOldManFragment extends Fragment {

    private TheTerribleOldManViewModel mViewModel;

    public static TheTerribleOldManFragment newInstance() {
        return new TheTerribleOldManFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.the_terrible_old_man_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TheTerribleOldManViewModel.class);
        // TODO: Use the ViewModel
    }

}
