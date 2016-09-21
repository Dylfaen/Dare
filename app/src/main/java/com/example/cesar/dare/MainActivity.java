package com.example.cesar.dare;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getStreaming(View view) {
        Intent intent = new Intent(this, StreamingActivity.class);
        String message = "Success !";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void getViewing(View view) {
        Intent intent = new Intent(this, ViewingActivity.class);
        String message = "Success !";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
