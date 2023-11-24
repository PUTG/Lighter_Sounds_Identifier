package com.example.mldemo.helpers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import android.Manifest;
import android.os.Build;
import com.example.mldemo.R;

public class AudioHelperActivity extends AppCompatActivity {


    protected TextView outputTextView;
    protected TextView specsTextView;
    protected Button startRecordingButton;
    protected Button stopRecordingButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_helper);

        outputTextView = findViewById(R.id.audio_output_textview);
        specsTextView = findViewById(R.id.audio_specs_textview);
        startRecordingButton = findViewById(R.id.audio_btn_start_recording);
        stopRecordingButton = findViewById(R.id.audio_btn_stop_recording);

        stopRecordingButton.setEnabled(false);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.RECORD_AUDIO)
                    != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO}, 0);


            }
        }
    }

    public void startRecording(View view){
        startRecordingButton.setEnabled(false);
        stopRecordingButton.setEnabled(true);
    }

    public void stopRecording(View view){
        startRecordingButton.setEnabled(true);
        stopRecordingButton.setEnabled(false);
    }
}