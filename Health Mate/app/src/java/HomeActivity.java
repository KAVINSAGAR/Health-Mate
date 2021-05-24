package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView logo;
    Button assess,plan,medicine,hospital,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logo=findViewById(R.id.logo);
        assess=findViewById(R.id.selfanalysis);
        hospital=findViewById(R.id.hospital);
        plan=findViewById(R.id.plan);
        medicine=findViewById(R.id.medicine);
        logout=findViewById(R.id.power);

        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,SliderActivity.class));
            }
        });
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MedicineActivity.class));
            }
        });
        assess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,SelfAccess.class));
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,Hospital_Activity.class));
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            }
        });
    }
}
