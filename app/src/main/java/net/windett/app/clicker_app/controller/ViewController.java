package net.windett.app.clicker_app.controller;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import net.windett.app.clicker_app.MainActivity;
import net.windett.app.clicker_app.handlers.ClickHandler;

public class ViewController extends AppCompatActivity {

    private MainActivity mainActivity;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        mainActivity = new MainActivity();

        savedInstanceState.putInt("clicks", mainActivity.getClicks());

        super.onSaveInstanceState(savedInstanceState);
    }

//onRestoreInstanceState

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        int clicks = savedInstanceState.getInt("clicks");
    }
}
