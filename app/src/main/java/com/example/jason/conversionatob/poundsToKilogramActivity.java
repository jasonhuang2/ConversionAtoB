package com.example.jason.conversionatob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class poundsToKilogramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pounds_to_kilogram_activity);

        //Back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void calulateButton(View v){

        TextView convertingTarget = (TextView)findViewById(R.id.convertingText);
        EditText convertingInput = (EditText)findViewById(R.id.beingConvertedInput);
        TextView resultBox = (TextView)findViewById(R.id.resultBox);

        String stringConvertingTarget = convertingTarget.getText().toString();
        String stringConvertingInput = convertingInput.getText().toString();

        //User case #1: If the converting target is from pound to kilogram
        if(stringConvertingTarget.matches("POUND")){

            if(stringConvertingInput.matches("")){
                resultBox.setText("Please enter a number to convert");
            }else{

                Double pound = Double.parseDouble(convertingInput.getText().toString());
                Double kilogram = Math.round((pound * 0.45359237) * 10000.0) / 10000.0;

                resultBox.setText(Double.toString(kilogram) + " kilograms(kg)");

            }

        }

        //User case #2: If the converting target is kilograms to pounds
        if(stringConvertingTarget.matches("KILOGRAM")){

            if(stringConvertingInput.matches("")){
                resultBox.setText("Please enter a number to convert");
            }else{

                Double kilogram = Double.parseDouble(convertingInput.getText().toString());
                Double pound = Math.round((kilogram / 0.45359237) * 10000.0) / 10000.0;

                resultBox.setText(Double.toString(pound) + " Pounds(lb)");

            }

        }

    }

    public void reverseButton(View v){
        TextView convertingFrom = (TextView)findViewById(R.id.convertingText);
        TextView convertingTo = (TextView)findViewById(R.id.convertingText2);

        String stringConvertingFrom = convertingFrom.getText().toString();
       // String stringConvertingTo = convertingTo.getText().toString();

        if(stringConvertingFrom.matches("POUND")){
            convertingFrom.setText("KILOGRAM");
            convertingTo.setText("POUND");

        }else if(stringConvertingFrom.matches("KILOGRAM")){
            convertingFrom.setText("POUND");
            convertingTo.setText("KILOGRAM");
        }


    }
}
