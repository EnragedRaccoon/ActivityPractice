package com.example.activitypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class composeMessageActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        Intent i = getIntent();
        String name = i.getStringExtra("NAME");

        if (name == null) // If a name is not found, it will default to the following message
        {
            ((TextView)findViewById(R.id.textView)).setText("Composing Message");
        }

        else //Gets name from button
        {
            ((TextView)findViewById(R.id.textView)).setText(name);
        }

    }

}