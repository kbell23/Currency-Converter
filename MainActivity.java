package com.asp.kevinbell.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        // gets number from user
        EditText usToEuroImageView = (EditText) findViewById(R.id.userData);
        Log.i("Amount", usToEuroImageView.getText().toString());

        // creates the doubles to be displayed to the user
        Double val = Double.parseDouble(usToEuroImageView.getText().toString());
        Double poundAmount = val * 0.86;

        // displays result using 0.86 conversion as of May 2018
        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", poundAmount), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
