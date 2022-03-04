package com.example.md5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Вы нажали на кнопку", Toast.LENGTH_SHORT);
        toast.show();
    }
}


