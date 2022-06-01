package com.example.infovacs.ui.aboutproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.infovacs.databinding.AboutProjectBinding;

public class AboutprojectFragment extends Fragment {

    private AboutProjectBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle saveInstanceState) {

        AboutprojectViewModel aboutprojectViewModel =
                new ViewModelProvider(this).get(AboutprojectViewModel.class);

        binding = AboutProjectBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
