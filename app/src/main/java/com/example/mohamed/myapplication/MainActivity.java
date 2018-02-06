package com.example.mohamed.myapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Frgmnt2(View view) {

        fragment=new BlankFragment2();
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment,fragment);
        ft.commit();
    }

    public void frgmnt1(View view) {
        fragment=new BlankFragment1();
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment,fragment);
        ft.commit();
    }
}
