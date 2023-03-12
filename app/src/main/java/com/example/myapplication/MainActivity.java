package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt=findViewById(R.id.button);
        bt.setOnClickListener(view -> {
            EditText et=findViewById(R.id.edit);
            String name=et.getText().toString();
            TextView tv=findViewById(R.id.textView);
            tv.setText(name);
            if(name.charAt(0)==name.toUpperCase().charAt(0))
            {
                ImageView iv=findViewById(R.id.image);
                iv.setImageResource(R.drawable.sea);
            }
            else if(name.charAt(0)==name.toLowerCase().charAt(0))
            {
                ImageView iv=findViewById(R.id.image);
                iv.setImageResource(R.drawable.sky);
            }
        });
    }
}