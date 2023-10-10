package com.example.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
Button button;
FloatingActionButton floatingActionButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LOG","onCreate invoked");
        Toast.makeText(this, "ON Create", Toast.LENGTH_SHORT).show();
        button=findViewById(R.id.next);
        floatingActionButton=findViewById(R.id.floating);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecandActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "ON Pause", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onPause invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ON Start", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onStart invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ON Stop", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "ON Restart", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onRestart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "ON Resume", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onResume invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ON Destroy", Toast.LENGTH_SHORT).show();
        Log.d("LOG","onDestroy invoked");
    }
}