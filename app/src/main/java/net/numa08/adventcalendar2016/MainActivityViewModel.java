package net.numa08.adventcalendar2016;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import net.numa08.adventcalendar2016.BR;

public class MainActivityViewModel extends BaseObservable {

    @Bindable
    private String message;

    public MainActivityViewModel() {
        setMessage("not clicked");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    public void onClickButton(View view) {
        setMessage("clicked");
    }
}
