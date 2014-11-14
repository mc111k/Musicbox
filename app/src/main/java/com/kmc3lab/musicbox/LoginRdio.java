package com.kmc3lab.musicbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by KMC-Desktop on 2014-11-13.
 */
public class LoginRdio extends MainActivity.PlaceholderFragment {

    View rootView;
    Button rdioButton;

    public LoginRdio() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.login_rdio, container, false);
        rdioButton = (Button) rootView.findViewById(R.id.rdioButton);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //TODO Add Rdio stuff here
        // and modify login_rdio.xml file for UI

        // sample
        rdioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity.getBaseContext(), "Button clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
