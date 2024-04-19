package com.example.avesamerica;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class America extends AppCompatActivity {

    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);


        // Crear MediaPlayer para cada audio
        mediaPlayer1 = MediaPlayer.create(this, R.raw.quetzal);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.gallitorocas);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.condorandino);
    }

    // Método para reproducir un sonido y detener los otros
    private void playSound(MediaPlayer mediaPlayer) {
        // Detener todos los MediaPlayers antes de reproducir uno nuevo
        if (mediaPlayer1.isPlaying()) {
            mediaPlayer1.pause();
            mediaPlayer1.seekTo(0);
        }
        if (mediaPlayer2.isPlaying()) {
            mediaPlayer2.pause();
            mediaPlayer2.seekTo(0);
        }
        if (mediaPlayer3.isPlaying()) {
            mediaPlayer3.pause();
            mediaPlayer3.seekTo(0);
        }
        // Reproducir el sonido solicitado
        mediaPlayer.start();
    }

    // Método para reproducir audio1 cuando se hace clic en el ImageButton1
    public void playAudio1(View view) {
        playSound(mediaPlayer1);
    }

    // Método para reproducir audio2 cuando se hace clic en el ImageButton2
    public void playAudio2(View view) {
        playSound(mediaPlayer2);
    }

    // Método para reproducir audio3 cuando se hace clic en el ImageButton3
    public void playAudio3(View view) {
        playSound(mediaPlayer3);
    }

    public void onclick(View view){
        final int imageButton1=R.id.imageHome;
        Intent _volver=null;
        if (view.getId()==imageButton1){
            _volver=new Intent(America.this, MainActivity.class);
            Toast.makeText(this, "Aves del mundo", Toast.LENGTH_SHORT).show();
        }
        startActivity(_volver);
    }


    @Override
    protected void onStop() {
        super.onStop();
        // Liberar recursos de MediaPlayer
        if (mediaPlayer1 != null) {
            mediaPlayer1.release();
        }
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
        }
    }

}