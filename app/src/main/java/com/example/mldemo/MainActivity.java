package com.example.mldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mldemo.audio.AudioClassificationActivity;
import com.example.mldemo.audio.LighterSoundIdentifierActivity;

import android.view.View;

import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGotoAudioClassfication(View view){
        //start the Image helper activity
        Intent intent = new Intent(this, AudioClassificationActivity.class);
        startActivity(intent);
    }
    public void onGotoLighterSoundIdentifier(View view){
        //start the Image helper activity
        Intent intent = new Intent(this, LighterSoundIdentifierActivity.class);
        startActivity(intent);
    }
}