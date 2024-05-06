package com.example.mmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
Button button,button2,button3,button4,button5,button6;
MediaPlayer mediaPlayer,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6;
SeekBar seekBar,seekBar2,seekBar3,seekBar4,seekBar5,seekBar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3 = findViewById(R.id.seekBar3);
        seekBar4 = findViewById(R.id.seekBar4);
        seekBar5 = findViewById(R.id.seekBar5);
        seekBar6 = findViewById(R.id.seekBar6);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
        seekBar.setMax(mediaPlayer.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    button.setText("PLAY");
                }
                else{
                    mediaPlayer.start();
                    button.setText("PAUSE");
                }
            }
        });
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.sound);
        seekBar2.setMax(mediaPlayer2.getDuration());
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer2.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                    button2.setText("PLAY");
                }
                else{
                    mediaPlayer2.start();
                    button2.setText("PAUSE");
                }
            }
        });
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.ladki);
        seekBar3.setMax(mediaPlayer3.getDuration());
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer3.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                    button3.setText("PLAY");
                }
                else{
                    mediaPlayer3.start();
                    button3.setText("PAUSE");
                }
            }
        });
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.nazm);
        seekBar4.setMax(mediaPlayer4.getDuration());
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer4.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer4.isPlaying()){
                    mediaPlayer4.pause();
                    button4.setText("PLAY");
                }
                else{
                    mediaPlayer4.start();
                    button4.setText("PAUSE");
                }
            }
        });

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.pyar);
        seekBar5.setMax(mediaPlayer5.getDuration());
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer5.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer5.isPlaying()){
                    mediaPlayer5.pause();
                    button5.setText("PLAY");
                }
                else{
                    mediaPlayer5.start();
                    button5.setText("PAUSE");
                }
            }
        });
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.sajjan);
        seekBar6.setMax(mediaPlayer6.getDuration());
        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                if(fromUser){
                    mediaPlayer6.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer6.isPlaying()){
                    mediaPlayer6.pause();
                    button6.setText("PLAY");
                }
                else{
                    mediaPlayer6.start();
                    button6.setText("PAUSE");
                }
            }
        });


    }
}