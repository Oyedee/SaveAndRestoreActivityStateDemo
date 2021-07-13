package com.example.shareandrestoredemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mainText;
    private Button tapButton;
    String displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLogs("onCreate method is called");

        mainText = findViewById(R.id.mainText);
        tapButton = findViewById(R.id.click_button);

        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayText = "Hello! You clicked me!!";
                mainText.setText(displayText);
            }
        });
    }

    public void myLogs(String textLog) {
        Log.i("TAGS", textLog);
    }

    @Override
    protected void onStart() {
        super.onStart();
        myLogs("onStart method is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        myLogs("onRestart method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        myLogs("onResume method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        myLogs("onPause method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        myLogs("onStop method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myLogs("onDestroy method is called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        myLogs("onSaveInstanceState method is called");

        outState.putString("STRING_VALUE", displayText);
    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        myLogs("onRestoreInstanceState method is called");

        displayText = savedInstanceState.getString("STRING_VAlUE");
        mainText.setText(displayText);
    }
}