package com.example.zakiryousuf.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int score=0;

    public void random(View view){
    EditText txt=(EditText)findViewById(R.id.txtans);
    String s=txt.getText().toString();
    txt.setText(null);
    int ans=Integer.parseInt(s);
        Random ran=new Random();
        TextView rn1=(TextView)findViewById(R.id.r1);
        TextView rn2=(TextView)findViewById(R.id.r2);
        TextView txtscore=(TextView)findViewById(R.id.txtscore);

    int r1=ran.nextInt(10);
    int r2=ran.nextInt(10);
    int c=r1+r2;

        rn2.setText(String.valueOf(r2));
        rn1.setText(String.valueOf(r1));
    if(c==ans)
    {
        score=score+10;
        txtscore.setText(String.valueOf(score));

    }
    else{
        score=score-10;
        txtscore.setText(String.valueOf(score));
    }
        Toast.makeText(getApplicationContext(),"you have entered"+'s' , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
