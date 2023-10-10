package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class SecandActivity extends AppCompatActivity {
    FrameLayout frame;
    Button buttonNext, btnnext;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secand);
        frame = findViewById(R.id.frameLayout);
        buttonNext = findViewById(R.id.add);
        btnnext = findViewById(R.id.nextFrag);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new frag2());
                fragmentTransaction.commit();
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, new frag1());
                fragmentTransaction.commit();
            }
        });
        Toast.makeText(this, "2: On Create", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2: onCreate invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "2: ON Pause", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2:onPause invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "2: ON Start", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2:onStart invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "2: ON Stop", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2: onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "2: ON Restart", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2:On Restart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "2: ON Resume", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2: onResume invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "2: ON Destroy", Toast.LENGTH_SHORT).show();
        Log.d("LOG", "2: onDestroy invoked");
    }
}