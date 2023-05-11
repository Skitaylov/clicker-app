package net.windett.app.clicker_app.handlers;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

public class ClickHandler implements View.OnClickListener{

    private int clicks;
    private final TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        clicks++;
        textView.setText("Нажатий: "+clicks);
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public ClickHandler(TextView textView) {
        this.textView = textView;
    }
}
