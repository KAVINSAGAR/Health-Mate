package com.example.healthmate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email,uname,pass,moile,address;
    Button signup;
    //float v=0;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        ViewGroup root= (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);

        email=root.findViewById(R.id.semail);
        uname=root.findViewById(R.id.suname);
        pass=root.findViewById(R.id.spass);
        moile=root.findViewById(R.id.smobile);
        address=root.findViewById(R.id.saddress);
        signup=root.findViewById(R.id.signup);

        uname.setTranslationX(800);
        email.setTranslationX(800);
        pass.setTranslationX(800);
        moile.setTranslationX(800);
        address.setTranslationX(800);
        signup.setTranslationX(800);

        uname.setAlpha(0);
        email.setAlpha(0);
        pass.setAlpha(0);
        moile.setAlpha(0);
        address.setAlpha(0);
        signup.setAlpha(0);

        uname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        moile.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        address.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();


        return root;
    }
}
