package com.z3t4z00k.tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void transfer(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
