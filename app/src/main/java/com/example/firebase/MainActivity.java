package com.example.firebase;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    
    EditText edName, edLon, edLat;
    DatabaseReference mDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.name);
        edLon = findViewById(R.id.lon);
        edLat = findViewById(R.id.lat);
        mDataBase = FirebaseDatabase.getInstance().getReference();
    }

    public void onClick(View v) {
        String name = edName.getText().toString();
        String lon = edLon.getText().toString();
        Float fLon = Float.parseFloat(lon);
        String lat = edLat.getText().toString();
        Float fLat = Float.parseFloat(lat);

        Place place = new Place(name, fLon, fLat);
        mDataBase.push().setValue(place);
    }
}