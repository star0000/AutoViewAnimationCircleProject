package com.example.autoviewanimationcircleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CircleProgressView circleProgress1;
    private CircleProgressView circleProgress2;
    private CircleProgressView circleProgress3;
    private CircleProgressView circleProgress4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        circleProgress1 = (CircleProgressView) findViewById(R.id.circleProgress1);
        circleProgress2 = (CircleProgressView) findViewById(R.id.circleProgress2);
        circleProgress3 = (CircleProgressView) findViewById(R.id.circleProgress3);
        circleProgress4 = (CircleProgressView) findViewById(R.id.circleProgress4);
        circleProgress1.start();
        circleProgress2.start();
        circleProgress3.start();
        circleProgress4.start();

        circleProgress1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click 1", Toast.LENGTH_SHORT).show();
            }
        });

        circleProgress1.setOnLoadingComplete(new CircleProgressView.OnLoadingComplete() {
            @Override
            public void OnLoadingComplete() {
                Toast.makeText(MainActivity.this, "Complete 1", Toast.LENGTH_SHORT).show();
            }
        });
        circleProgress2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click 2", Toast.LENGTH_SHORT).show();
            }
        });

        circleProgress2.setOnLoadingComplete(new CircleProgressView.OnLoadingComplete() {
            @Override
            public void OnLoadingComplete() {
                Toast.makeText(MainActivity.this, "Complete 2", Toast.LENGTH_SHORT).show();
            }
        });

        circleProgress3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click 3", Toast.LENGTH_SHORT).show();
            }
        });

        circleProgress3.setOnLoadingComplete(new CircleProgressView.OnLoadingComplete() {
            @Override
            public void OnLoadingComplete() {
                Toast.makeText(MainActivity.this, "Complete 3", Toast.LENGTH_SHORT).show();
            }
        });
        circleProgress4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click 4", Toast.LENGTH_SHORT).show();
            }
        });

        circleProgress4.setOnLoadingComplete(new CircleProgressView.OnLoadingComplete() {
            @Override
            public void OnLoadingComplete() {
                Toast.makeText(MainActivity.this, "Complete 4", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
