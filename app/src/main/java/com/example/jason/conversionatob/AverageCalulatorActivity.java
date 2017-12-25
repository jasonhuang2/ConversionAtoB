package com.example.jason.conversionatob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AverageCalulatorActivity extends AppCompatActivity {



    Integer inputs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.average_calulator_activity);

        //These two are the back button. Required to go back to the main menu.
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void calulateButton(View v){



        Double partOne;

    }

}
