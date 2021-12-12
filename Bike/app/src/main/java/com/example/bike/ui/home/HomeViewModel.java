package com.example.bike.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("bienvenido a productos, espera nuestra proxima version con mas mejoras pensando en ti ;) ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}