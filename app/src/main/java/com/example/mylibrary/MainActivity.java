package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onBtnClick(View view) {
        TextView txtHello = findViewById(R.id.txtMessage);
        EditText editText = findViewById(R.id.edtTxtMessage);
        String text = editText.getText().toString();
        txtHello.setText("Hello " + text);
    }
}