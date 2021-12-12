package com.example.bike.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("bienvenido a sucursales, espera nuestra proxima version con mas mejoras pensando en ti ;) ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}