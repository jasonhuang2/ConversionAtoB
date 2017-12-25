package com.example.jason.conversionatob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
    }

    //This function is like a controller. Once the KM to Metres button is clicked, this function is called and the user is re-directed to the KM to Metre activity.
    protected void setKmToMetres(View v){
        Intent intent = new Intent(this, kmToMilesActivity.class);
        startActivity(intent);
    }
    //This function is like a controller. Once the Pound to Kilogram button is clicked, this function is called and the user is re-directed to the Pound to Kilogram activity.
    protected void setPoundToKilogram(View v){
        Intent intent = new Intent(this, poundsToKilogramActivity.class);
        startActivity(intent);
    }
    //This function is like a controller. Once the average calulator button is clicked, this function is called and the user is re-directed to the average calulator activity.
    protected void averageCalulatorButton(View v){
        Intent intent = new Intent(this, AverageCalulatorActivity.class);
        startActivity(intent);
    }
}

