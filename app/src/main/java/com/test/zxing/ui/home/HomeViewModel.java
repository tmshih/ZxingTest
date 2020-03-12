package com.test.zxing.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mQRText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        mQRText = new MutableLiveData<>();
        mQRText.setValue("https://www.youtube.com.tw");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getQRText() {
        return mQRText;
    }
}