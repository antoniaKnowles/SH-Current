package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragmentFour extends Activity {//https://javapapers.com/android/get-user-input-in-android/

    Button mButton;
    EditText mEdit;
    TextView mText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second_four);
        mButton = (Button) findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = (EditText) view.findViewById(R.id.editText1);
                mText = (TextView) view.findViewById(R.id.textView1);
                mText.setText("Welcome " + mEdit.getText().toString() + "!");
            }
        });
    }
}