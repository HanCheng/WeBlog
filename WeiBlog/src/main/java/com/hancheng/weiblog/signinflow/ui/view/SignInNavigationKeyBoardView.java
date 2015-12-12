package com.hancheng.weiblog.signinflow.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hancheng.weiblog.R;

/**
 * Created by chan on 12/8/15.
 */
public class SignInNavigationKeyBoardView extends LinearLayout {

    private TextView mNavigationText;
    private OnNavigationClickedListener mListener;

    public SignInNavigationKeyBoardView(Context context) {
        super(context);
    }

    public SignInNavigationKeyBoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SignInNavigationKeyBoardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initViewElements();
    }

    public void setOnNavigationListener(OnNavigationClickedListener listener) {
        mListener = listener;
    }

    private void initViewElements() {
        mNavigationText = (TextView) findViewById(R.id.navigation_text);
        mNavigationText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onNavigationClicked();
            }
        });
        findViewById(R.id.forget_password).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onPasswordForgetClicked();
            }
        });
    }

    public void setNavigationText(String text) {
        mNavigationText.setText(text);
    }

    public void setNavigationEnabled(boolean isEnabled) {
        mNavigationText.setBackgroundResource(isEnabled ? R.drawable.round_corner_blue_valid : R.drawable.round_corner_blue_invalid);
        if (!isEnabled) {
            mListener = null;
        }
    }

    public interface OnNavigationClickedListener {
        void onNavigationClicked();
        void onPasswordForgetClicked();
    }

}
