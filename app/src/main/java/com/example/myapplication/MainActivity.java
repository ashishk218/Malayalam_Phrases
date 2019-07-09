package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void fun1(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.how);
        mediaPlayer.start();
    }
    public void fun2(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.love);
        mediaPlayer.start();
    }
   public void fun3(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.where);
        mediaPlayer.start();
    }
    public void fun4(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.distance);
        mediaPlayer.start();
    }
    public void fun5(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.come);
        mediaPlayer.start();
    }
    public void fun6(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.answer);
        mediaPlayer.start();
    }
    public void fun7(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.name);
        mediaPlayer.start();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
