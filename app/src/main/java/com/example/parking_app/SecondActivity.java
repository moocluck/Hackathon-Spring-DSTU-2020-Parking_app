package com.example.parking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button qrButton;
    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        qrButton = findViewById(R.id.qrBtn);

        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int fName = (editTextTextPersonName.getText() == null)?0:Integer.parseInt(editTextTextPersonName.getText().toString());
                int lName = (editTextTextPersonName2.getText() == null)?0:Integer.parseInt(editTextTextPersonName2.getText().toString());
                int carNumber = (editTextTextPersonName3.getText() == null)?0:Integer.parseInt(editTextTextPersonName3.getText().toString());

                Intent intent = new Intent (SecondActivity.this, Qr_scanner.class);
                startActivity(intent);
            }
        });

    }
}