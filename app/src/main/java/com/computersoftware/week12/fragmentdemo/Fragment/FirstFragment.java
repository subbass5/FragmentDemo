package com.computersoftware.week12.fragmentdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.computersoftware.week12.fragmentdemo.R;

public class FirstFragment extends Fragment {

    TextView tv_show;
    Button btn_frg2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        tv_show = view.findViewById(R.id.tv_show);
        btn_frg2 = view.findViewById(R.id.btn_frg2);
        tv_show.setText("Fragment 1");
        tv_show.setTextSize(30f);
        btn_frg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                manager.popBackStack();
                transaction.replace(R.id.contentFragment,new SecondFragment())
                        .addToBackStack(null).commit();
            }
        });

        return view;
    }
}
