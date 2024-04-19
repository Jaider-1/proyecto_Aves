package com.example.avesamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imagen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen1=findViewById(R.id.imageButton1);

    }

    public void onclik(View view){
        final int imageButton1=R.id.imageButton1;
        final int imageButton2=R.id.imageButton2;
        final int imageButton3=R.id.imageButton3;
        final int imageButton4=R.id.imageButton4;
        final int imageButton5=R.id.imageButton5;
        Intent myIntent;
        myIntent=null;


        if (view.getId() == imageButton1){
            myIntent= new Intent(MainActivity.this, America.class);
            Toast.makeText(this, "Aves de America", Toast.LENGTH_SHORT).show();
        }else
        if (view.getId() == imageButton2){
            myIntent= new Intent(MainActivity.this, Europa.class);
            Toast.makeText(this, "Aves de Eruopa", Toast.LENGTH_SHORT).show();
        }else
           if (view.getId() == imageButton3){
            myIntent= new Intent(MainActivity.this, Africa.class);
            Toast.makeText(this, "Aves de Africa", Toast.LENGTH_SHORT).show();
        }else
           if (view.getId() == imageButton4){
            myIntent= new Intent(MainActivity.this, Asia.class);
            Toast.makeText(this, "Aves de Asia", Toast.LENGTH_SHORT).show();
           }else
           if (view.getId() == imageButton5){
               myIntent= new Intent(MainActivity.this, Oceania.class);
               Toast.makeText(this, "Aves de Oceania", Toast.LENGTH_SHORT).show();
           }
        startActivity(myIntent);
    }


}