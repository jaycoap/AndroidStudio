package com.cookandroid.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button strBtn1;
    Button photobutton;
    Button callbutton;
    Button finishbutton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strBtn1 = (Button) findViewById(R.id.strBtn1);
        photobutton = (Button) findViewById(R.id.photobutton);
        callbutton = (Button) findViewById(R.id.callbutton);
        finishbutton = (Button) findViewById(R.id.finishbutton);

        strBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                startActivity(mIntent);
            }
        });
        photobutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });


    }
}