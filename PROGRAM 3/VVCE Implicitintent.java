package com.example.vvce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void about(View v){
        String url="www.vvce.ac.in/about-us/";
        Uri u=Uri.parse("http://"+url);
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
    public void con(View v){
        String url="0821 4276201";
        Uri u=Uri.parse("tel:"+url);
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
    public void loc(View v){
        String l="Vidyavardhaka College Of Engineering";
        Uri u=Uri.parse("geo:?q"+l);
        Intent i=new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}
