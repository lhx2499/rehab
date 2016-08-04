package com.example.limxiang.login_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cover extends AppCompatActivity implements View.OnClickListener{

    Button bContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);

        bContinue = (Button) findViewById(R.id.bContinue);


        bContinue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bContinue:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
