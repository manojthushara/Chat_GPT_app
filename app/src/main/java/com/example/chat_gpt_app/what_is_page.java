package com.example.chat_gpt_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class what_is_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_page);

        MaterialButton readmore = findViewById(R.id.readmorebtn);
        LinearLayout backtohome = findViewById(R.id.backhomebtn);
        TextView link = findViewById(R.id.link);
        TextView linkemail = findViewById(R.id.linkemail);

        link.setMovementMethod(LinkMovementMethod.getInstance());
        linkemail.setMovementMethod(LinkMovementMethod.getInstance());

        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(what_is_page.this, HomePage.class));
            }
        });

        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.pcguide.com/apps/what-is-chat-gpt/");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}