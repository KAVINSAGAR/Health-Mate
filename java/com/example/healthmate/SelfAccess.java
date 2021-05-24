package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SelfAccess extends AppCompatActivity {

    EditText name,age,gender,doq,temp,oxy;
    Button submit;
    CheckBox one,two,three,four,five,six,seven,eight,nine,ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_access);

        name=findViewById(R.id.input_name);
        age=findViewById(R.id.input_age);
        gender=findViewById(R.id.input_gender);
        doq=findViewById(R.id.input_day);
        temp=findViewById(R.id.input_temp);
        oxy=findViewById(R.id.input_oxy);
        submit=findViewById(R.id.submit);

        // survey data
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        ten=findViewById(R.id.ten);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=name.getText().toString();
                String userage=age.getText().toString();
                String usergender=gender.getText().toString();
                String userdoq=doq.getText().toString();
                String usertemp=temp.getText().toString();
                String useroxy=oxy.getText().toString();

                if (username.isEmpty() || userage.isEmpty() || usergender.isEmpty() || userdoq.isEmpty() || usertemp.isEmpty() || useroxy.isEmpty()){
                    Toast.makeText(SelfAccess.this, "Enter all the details", Toast.LENGTH_SHORT).show();
                }
                else{
                    int risk=0,none=0,low=0,med=0;
                    String final_result=null;
                    ArrayList<String> symptom_list= new ArrayList<String>();
                    if (one.isChecked()){
                        low+=1;
                        symptom_list.add(one.getText().toString());
                    }
                    if (two.isChecked()){
                        low+=1;
                        symptom_list.add(two.getText().toString());
                    }
                    if (three.isChecked()){
                        symptom_list.add(three.getText().toString());
                        med+=1;
                    }
                    if (four.isChecked()){
                        symptom_list.add(four.getText().toString());
                        med+=1;
                    }
                    if (five.isChecked()){
                        symptom_list.add(five.getText().toString());
                        med+=1;
                    }
                    if (six.isChecked()){
                        symptom_list.add(six.getText().toString());
                        risk+=1;
                    }
                    if (seven.isChecked()){
                        symptom_list.add(seven.getText().toString());
                        med+=1;
                    }
                    if (eight.isChecked()){
                        symptom_list.add(eight.getText().toString());
                        risk+=1;
                    }
                    if (nine.isChecked()){
                        symptom_list.add(nine.getText().toString());
                        risk+=1;
                    }
                    if (ten.isChecked()){
                        symptom_list.add(ten.getText().toString());
                        none+=1;
                    }
                    if (one.isChecked()==false && two.isChecked()==false && three.isChecked()==false && four.isChecked()==false && five.isChecked()==false
                            && six.isChecked()==false && seven.isChecked()==false && eight.isChecked()==false && nine.isChecked()==false
                            && ten.isChecked()==false){
                        Toast.makeText(SelfAccess.this, "Please check any of the Symptoms", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (risk>1 || Integer.parseInt(useroxy) <=90) {
                            final_result="Consult a Doctor.";
                        }
                        else if ( ( med >= 1 && Integer.parseInt(userdoq) <=11 ) || (risk==1) || (low<=2 && Integer.parseInt(userdoq) <=7)){
                            final_result="Continue at home quarantine for few more days.";
                        }
                        else if ( (low<=2 && Integer.parseInt(userdoq) >7) || none==1){
                            final_result="Discontinue Home quarantine after taking swab test and get vaccinated.";
                        }
                        String str_sym="";
                        for(int i=0;i<symptom_list.size()-1;++i){
                            str_sym+= symptom_list.get(i)+",";
                        }
                        str_sym+=symptom_list.get(symptom_list.size()-1)+".";
                        Intent intent = new Intent(SelfAccess.this, Report.class);
                        intent.putExtra("Keyname",username);
                        intent.putExtra("Keyage",userage);
                        intent.putExtra("Keygender",usergender);
                        intent.putExtra("Keydoq",userdoq);
                        intent.putExtra("Keytemp",usertemp);
                        intent.putExtra("Keyoxy",useroxy);
                        intent.putExtra("Keysymp",str_sym);
                        intent.putExtra("Keyresult",final_result);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}
