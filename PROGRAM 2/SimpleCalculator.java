package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        tv=findViewById(R.id.textView);

    }
    public void add(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1+n2;
        tv.setText(""+res);
    }
    public void sub(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1-n2;
        tv.setText(""+res);
    }
    public void mul(View v){
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        int res=n1*n2;
        tv.setText(""+res);
    }
    public void div(View v){
        float n1=Float.parseFloat(e1.getText().toString());
        float n2=Float.parseFloat(e2.getText().toString());
        float res=n1/n2;

        if (n1>=0){
            if(n2==0){
                tv.setText("Error");
            }
            else{
                tv.setText(""+res);
            }
        }

    }
}
