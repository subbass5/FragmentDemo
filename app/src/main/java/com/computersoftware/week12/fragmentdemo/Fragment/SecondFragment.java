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

public class SecondFragment extends Fragment {

    TextView tv_show2;
    Button btn_frg1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
            tv_show2 = view.findViewById(R.id.tv_show2);
            btn_frg1  = view.findViewById(R.id.btn_frg1);

            tv_show2.setText("Fragment 2 ");
            tv_show2.setTextSize(20f);
            btn_frg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    manager.popBackStack();
                    transaction.replace(R.id.contentFragment,new FirstFragment())
                            .addToBackStack(null).commit();

                }
            });
        return view;
    }
}
