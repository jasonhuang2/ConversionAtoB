package com.example.jason.conversionatob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class gallonsToLitres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallons_to_litres_activity);
    }



    public void calculateButton(View v){
        TextView convertingTextbox1 = (TextView)findViewById(R.id.convertingText1);
        TextView convertingTextbox2 = (TextView)findViewById(R.id.convertingText2);


        Double result;

        EditText inputValue = (EditText)findViewById(R.id.inputBox);
        TextView resultBox = (TextView)findViewById(R.id.resultBox);


        if(convertingTextbox1.getText().equals("Litres")){
            result = Double.parseDouble(inputValue.getText().toString());
            result = result / 3.785;

            resultBox.setText(Double.toString(result));

        }else{
            result = Double.parseDouble(inputValue.getText().toString());
            result = result * 3.785;

            resultBox.setText(Double.toString(result));

        }
    }

    public void reverseButton2(View v){
        TextView convertingTextbox1 = (TextView)findViewById(R.id.convertingText1);
        TextView convertingTextbox2 = (TextView)findViewById(R.id.convertingText2);


        if(convertingTextbox1.getText().toString().equals("Litres")){
            convertingTextbox1.setText("Gallons");
            convertingTextbox2.setText("Litres");

        }else{
            convertingTextbox1.setText("Litres");
            convertingTextbox2.setText("Gallons");
        }


    }
}
