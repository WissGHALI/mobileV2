package com.example.pfa_lastversion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrendreRdvActivity extends AppCompatActivity {
    private Button infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prendre_rdv);

        // Find views by their IDs
        infoButton = findViewById(R.id.buttonSubmit);

        // Set click listener for the infoButton
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click event
            }
        });

        // Add other necessary code for your activity
    }

    // Add other methods and functionality as needed
}
