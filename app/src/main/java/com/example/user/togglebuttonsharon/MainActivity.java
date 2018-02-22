package com.example.user.togglebuttonsharon;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb1;
    Switch switch1;
    LinearLayout allView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tb1=(ToggleButton)findViewById(R.id.tb1);
        switch1=(Switch)findViewById(R.id.switch1);
        allView = (LinearLayout)findViewById(allView);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void goToggle(View view) {
        if (tb1.isChecked())
            allView.setBackgroundColor(RED);
        allView.setBackgroundColor(BLUE);
    }

    public void goSwitch(View view) {
        if (switch1.isChecked())
            allView.setBackgroundColor(GREEN);
        allView.setBackgroundColor(YELLOW);
    }
}
