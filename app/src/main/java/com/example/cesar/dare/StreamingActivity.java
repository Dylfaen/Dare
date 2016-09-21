package com.example.cesar.dare;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.io.File;
import java.io.IOException;
import java.net.URI;

public class StreamingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streaming);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setTextSize(40);
        textView.setText(message);



        String url = "https://pixabay.com/en/videos/download/video-5317_720p.mp4?attachment"; // your URL here

        VideoView video=(VideoView)findViewById(R.id.videoView);
        video.setVideoURI(Uri.parse(url));

        MediaController ctlr=new MediaController(this);
        ctlr.setMediaPlayer(video);
        video.setMediaController(ctlr);
        video.requestFocus();
        video.start();
    }

    public void replay(View view) {
        VideoView videoView = (VideoView) this.findViewById(R.id.videoView);
        videoView.stopPlayback();
        videoView.start();
    }

}
