package com.app.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("avvds","11111111111111111111");
                HttpMethods.getInstance().getJoke();
            }
        });
    }
}
