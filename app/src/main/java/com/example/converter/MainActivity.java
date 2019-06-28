package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1, et2;
String input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
    }

    public void Convert(View view) {

        input = et1.getText().toString();
        Double inches = Double.parseDouble(input)/25.4;
        et2.setText(inches.toString());
    }

    public void exit(View view) {
        finish();
    }
}
