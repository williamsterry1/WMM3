package com.dinosoftlabs.binder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.dinosoftlabs.binder.Accounts.Login_Phone_A;

public class WelcomeTwo_A extends AppCompatActivity {

    ImageView imgStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_two);

        initView();

    }

    private void initView() {

        imgStart = findViewById(R.id.img_start);

        imgStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(WelcomeTwo_A.this, Login_Phone_A.class));
                finish();
            }
        });

    }
}
