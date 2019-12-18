package com.example.musicplayertest;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicplayertest.POJO.MusicResponse;

public class MainActivity extends AppCompatActivity {

    private ApiCall apiCall;
    private Button btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }

    private void initViews() {
        btn_play = findViewById(R.id.btn_play);
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apiCall = new ApiCall(MainActivity.this);
                apiCall.retriveMusic();
            }
        });
    }


    public void playMusic(MusicResponse musicResponse) {
        String audioUrl = musicResponse.getTracks().getData().get(1).getPreview();

        Log.e("Music", audioUrl);
        Log.e("Music", audioUrl);
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            mediaPlayer.setDataSource(audioUrl);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
