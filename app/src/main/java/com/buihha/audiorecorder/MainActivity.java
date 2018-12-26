package com.buihha.audiorecorder;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Mp3Recorder recorder = new Mp3Recorder();

        findViewById(R.id.record).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    recorder.startRecording();
                } catch (IOException e) {
                    Log.d("MainActivity", "Start error");
                }
            }
        });

        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    recorder.stopRecording();
                } catch (IOException e) {
                    Log.d("MainActivity", "Stop error");
                }
            }
        });
    }
}
