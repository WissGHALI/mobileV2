package com.example.pfa_lastversion;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button btnRequest;
    private Button appointment2;
    private Button profile;
    private Button prendreRdv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnRequest = findViewById(R.id.btnRequst);
        appointment2 = findViewById(R.id.appointement2);
        profile = findViewById(R.id.profile);
        prendreRdv = findViewById(R.id.prendreRdv);

        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions to perform when "Voir les RDV" button is clicked
                // Replace with your desired logic
                Intent intent = new Intent(HomeActivity.this, AppointmentsActivity.class);
                startActivity(intent);
            }
        });

        appointment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions to perform when "Informations" button is clicked
                // Replace with your desired logic
                Intent intent = new Intent(HomeActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions to perform when "Profile" button is clicked
                // Replace with your desired logic
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        prendreRdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Actions to perform when "Prendre un RDV" button is clicked
                // Replace with your desired logic
                Intent intent = new Intent(HomeActivity.this, PrendreRdvActivity.class);
                startActivity(intent);
            }
        });
    }
}
