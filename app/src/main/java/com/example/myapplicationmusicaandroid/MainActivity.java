package com.example.myapplicationmusicaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play;
    SoundPool sp;

    int sonido_de_Reproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Clase SoundPool //
        play = (Button) findViewById(R.id.btn_play);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_de_Reproduccion = sp.load(this, R.raw.sound_short, 1);
    }

    //Método para poder reproducir //

    public void AudioSoundPool (View view) {
        sp.play(sonido_de_Reproduccion, 1,1,1, 0, 1);
    }

    //Método para reproducir MediaPlayer //
    public void MediaPlayer (View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_long);
        mp.start();

    }
}