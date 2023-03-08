package edu.ccm.rescuepets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(launch.this, MainActivity.class);
                startActivity(intent);
            }
        };

        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}