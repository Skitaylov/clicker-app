package net.windett.app.clicker_app;

import android.annotation.SuppressLint;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import net.windett.app.clicker_app.handlers.ClickHandler;

public class MainActivity extends AppCompatActivity {

    private ClickHandler clickHandler;
    private int clicks;


    public int getClicks() {
        return clicks;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView clicksText = findViewById(R.id.clickText);
        Button clickButton = findViewById(R.id.clickButton);

        clickHandler = new ClickHandler(clicksText);
        clicks = clickHandler.getClicks();
        clickButton.setOnClickListener(clickHandler);


    }
}