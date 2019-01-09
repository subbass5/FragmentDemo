package com.computersoftware.week12.fragmentdemo;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.computersoftware.week12.fragmentdemo.Fragment.FirstFragment;
import com.computersoftware.week12.fragmentdemo.Fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        FragmentTransaction frgTran = manager.beginTransaction();
        frgTran.replace(R.id.contentFragment ,new FirstFragment())
                .addToBackStack(null).commit();

    }

    @Override
    public void onBackPressed() {

        int countFrg = manager.getBackStackEntryCount();
        Toast.makeText(this,
                "Number Fragment :"+countFrg, Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("คุณต้องการออกจากแอพนี้หรือไม่");
        builder.setPositiveButton("ตกลง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                finish();
            }
        });

        builder.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        builder.show();

        //        super.onBackPressed();
    }
}
