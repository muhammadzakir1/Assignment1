package com.example.zakiryousuf.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frontActivity extends AppCompatActivity {

    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        btnStart =(Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent i=new Intent(frontActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
