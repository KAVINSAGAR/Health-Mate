package com.example.healthmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText email,password;
    Button login;
    float v=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root= (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        email=root.findViewById(R.id.lemail);
        password=root.findViewById(R.id.lpass);
        login=root.findViewById(R.id.login);

        email.setTranslationX(800);
        password.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),HomeActivity.class));
                /*if(email.equals("kavinsagar123@gmail.com") && password.equals("123456789")){
                    startActivity(new Intent(getActivity(),HomeActivity.class));
                }*/
            }
        });


        return root;
    }
}
