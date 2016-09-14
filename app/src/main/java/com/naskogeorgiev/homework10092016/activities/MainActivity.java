package com.naskogeorgiev.homework10092016.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.naskogeorgiev.homework10092016.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnTaskOne, mBtnTaskTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTaskOne = (Button) findViewById(R.id.btn_task1);
        mBtnTaskTwo = (Button) findViewById(R.id.btn_task2);
        mBtnTaskOne.setOnClickListener(this);
        mBtnTaskTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_task1)
            startActivity(new Intent(this, TaskOneActivity.class));
        if (v.getId() == R.id.btn_task2)
            startActivity(new Intent(this, TaskTwoActivity.class));
    }
}
