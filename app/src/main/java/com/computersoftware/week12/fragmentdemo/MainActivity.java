package com.computersoftware.week12.fragmentdemo;

import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.computersoftware.week12.fragmentdemo.Fragment.FirstFragment;
import com.computersoftware.week12.fragmentdemo.Fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager frgManager = getSupportFragmentManager();
        FragmentTransaction frgTran = frgManager.beginTransaction();
        frgTran.replace(R.id.contentFragment ,new SecondFragment())
                .addToBackStack(null).commit();


//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction frgTran = fragmentManager.beginTransaction();
//
//        frgTran.replace(R.id.contentFragment, new FirstFragment()).addToBackStack(null).commit();


    }
}
