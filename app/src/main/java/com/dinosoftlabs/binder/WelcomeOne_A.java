package com.dinosoftlabs.binder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WelcomeOne_A extends AppCompatActivity {

    ImageView imgNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_one);

        initView();
    }

    private void initView() {

        imgNext = findViewById(R.id.img_next);

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(WelcomeOne_A.this, WelcomeTwo_A.class));
                finish();
            }
        });
    }
}
