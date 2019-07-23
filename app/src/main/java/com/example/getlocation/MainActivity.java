package com.example.getlocation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView3;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GPSTracker gps = new GPSTracker (MainActivity.this);
                double latitude = gps.getLatitude();
                double longtiude = gps.getLongitude();
                textView.setText("Latitude : "+latitude+"Longitude : "+longtiude);
            }
        });

    }
}
