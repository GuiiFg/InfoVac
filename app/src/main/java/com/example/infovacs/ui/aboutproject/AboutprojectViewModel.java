package com.example.infovacs.ui.aboutproject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutprojectViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutprojectViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Aboutproject fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
