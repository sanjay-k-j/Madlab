package com.example.phone_dialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText pn;
Button clearbtn,savebtn,callbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pn = findViewById(R.id.phone);
        clearbtn = findViewById(R.id.clear);
        callbtn = findViewById(R.id.call);
        savebtn = findViewById(R.id.save);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pn.setText("");
            }
        });

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phno = pn.getText().toString();
                Intent i = new Intent(Intent.ACTION_INSERT);
                i.setType(ContactsContract.Contacts.CONTENT_TYPE); //specifies the type of the data stored.
                i.putExtra(ContactsContract.Intents.Insert.PHONE,phno);// acts as a method of intent which helps in sending the content to the next when invoked.
                startActivity(i);
            }
        });
        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phno = pn.getText().toString();
                Intent i = new Intent((Intent.ACTION_DIAL));
                i.setData(Uri.parse("tel:"+phno));
                startActivity(i);
            }
        });
    }
    public void input(View V){
        Button b = (Button)V;
        String digit = b.getText().toString();
        String phno = pn.getText().toString();
        pn.setText(phno+digit);
    }
}
