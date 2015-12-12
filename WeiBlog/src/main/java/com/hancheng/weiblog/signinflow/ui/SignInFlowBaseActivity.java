package com.hancheng.weiblog.signinflow.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hancheng.weiblog.R;

public class SignInFlowBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_flow_base);
    }
}
