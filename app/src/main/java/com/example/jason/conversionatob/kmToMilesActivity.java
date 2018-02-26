package com.example.jason.conversionatob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class kmToMilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.km_to_miles_activity);

        //Back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void calulateButton(View v) {

        EditText convertingInput = (EditText) findViewById(R.id.beingConverted);
        TextView convertingTarget = (TextView) findViewById(R.id.convertingText);
        TextView resultBox = (TextView) findViewById(R.id.resultBox);

        String stringConvertingTarget = convertingTarget.getText().toString();
        String stringConvertingInout = convertingInput.getText().toString();


        /*
        Case #1: Converting KM to Mile
         */
        if (stringConvertingTarget.matches("Kilometres per hour")) {

            //Subcase: If user forgets to input number
            if (stringConvertingInout.matches("")) {
                resultBox.setText("Please enter a number to convert");
            } else {
                Double km = Double.parseDouble(convertingInput.getText().toString());

                Double kmToMile = Math.round((km * 0.62137119223733) * 10000.0) / 10000.0;

                resultBox.setText(Double.toString(kmToMile) + " Miles per hour");
            }
        }
        /*
        Case #2: Converting Mile to KM
         */
        if (stringConvertingTarget.matches("Miles per hour")) {

            //Subcase: If user forgets to input number
            if (stringConvertingInout.matches("")) {
                resultBox.setText("Please enter a number to convert");
            } else {
                Double mile = Double.parseDouble(convertingInput.getText().toString());

                Double mileToKilometre = Math.round((mile / 0.62137119223733) * 10000.0) / 10000.0;

                resultBox.setText(Double.toString(mileToKilometre) + " Kilometres per hour");
            }
        }
    }


    public void reverseButton(View v) {
        TextView convertingText = (TextView)findViewById(R.id.convertingText);
        TextView convertingText2 = (TextView)findViewById(R.id.convertingText2);

        String stringConvertingText = convertingText.getText().toString();

        //Case #1: If converting text is KM
        if(stringConvertingText.matches("Kilometres per hour")){
            convertingText.setText("Miles per hour");
            convertingText2.setText("Kilometres per hour");
        }
        //Case #2: If converting text is Mile
        if(stringConvertingText.matches("Miles per hour")){
            convertingText.setText("Kilometres per hour");
            convertingText2.setText("Miles per hour");
        }
    }
}






