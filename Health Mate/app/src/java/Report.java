package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Report extends AppCompatActivity {

    private TextView name,age,gender,doq,date,temp,oxy,symp,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        String rep_res;

        name=findViewById(R.id.rep_user_name);
        age=findViewById(R.id.rep_user_age);
        gender=findViewById(R.id.rep_user_gender);
        doq=findViewById(R.id.rep_user_doq);
        date=findViewById(R.id.rep_user_date);
        temp=findViewById(R.id.rep_user_temp);
        oxy=findViewById(R.id.rep_user_oxy);
        symp=findViewById(R.id.rep_user_symp);
        result=findViewById(R.id.rep_res);


        if(getIntent().getStringExtra("Keyresult").equals("Consult a Doctor.")){
            result.setTextColor(getResources().getColor(R.color.alert));

        }
        else if (getIntent().getStringExtra("Keyresult").equals("Discontinue Home quarantine after taking swab test and get vaccinated.")){
            result.setTextColor(getResources().getColor(R.color.cured));
        }
        else{
            result.setTextColor(getResources().getColor(R.color.normal));
        }

        rep_res="Report: " + getIntent().getStringExtra("Keyresult");

        name.setText(getIntent().getStringExtra("Keyname"));
        age.setText(getIntent().getStringExtra("Keyage"));
        gender.setText(getIntent().getStringExtra("Keygender"));
        doq.setText(getIntent().getStringExtra("Keydoq"));
        temp.setText(getIntent().getStringExtra("Keytemp"));
        oxy.setText(getIntent().getStringExtra("Keyoxy"));
        symp.setText(getIntent().getStringExtra("Keysymp"));
        result.setText(rep_res);
        date.setText(new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date()));
    }
}
