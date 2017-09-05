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

    protected void setKmToMetres(View v){
        Intent intent = new Intent(this, kmToMilesActivity.class);
        startActivity(intent);
    }
    protected void setPoundToKilogram(View v){
        Intent intent = new Intent(this, poundsToKilogramActivity.class);
        startActivity(intent);
    }
}

