package com.example.chat_gpt_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        MaterialButton whatbtn =findViewById(R.id.whatbtn);
        MaterialButton usebtn =findViewById(R.id.usedbtn);
        MaterialButton protn =findViewById(R.id.probtn);
        MaterialButton trnbtn =findViewById(R.id.trainedonbtn);
        MaterialButton Codedbtn =findViewById(R.id.codedbtn);
        MaterialButton Gtp4btn =findViewById(R.id.gtpbtn);
        MaterialButton RegisterChatbtn =findViewById(R.id.registerchatbtn);
        MaterialButton ChatBotbtn =findViewById(R.id.chatbotbtn);
        MaterialButton Finalbtn =findViewById(R.id.finalbtn);
        MaterialButton Webbtn =findViewById(R.id.webbtn);
        MaterialButton Aboutbtn =findViewById(R.id.aboutbtn);
        TextView link = findViewById(R.id.link);
        TextView linkemail = findViewById(R.id.linkemail);

        link.setMovementMethod(LinkMovementMethod.getInstance());
        linkemail.setMovementMethod(LinkMovementMethod.getInstance());

        Aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, AboutPage.class));
            }
        });

        Webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://chrome.google.com/webstore/detail/chat-gpt/fnmihdojmnkclgjpcoonokmkhjpjechg");
            }
        });

        Finalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, FinalThoughtspage.class));
            }
        });

        ChatBotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, ChatBotPage.class));
            }
        });

        RegisterChatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, RegisterCahtPage.class));
            }
        });

        Gtp4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, Gtp4Page.class));
            }
        });

        Codedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, CodedPage.class));
            }
        });

        trnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, TrainedonPage.class));
            }
        });

        protn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, ProPage.class));
            }
        });

        usebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, UsedPage.class));
            }
        });

        whatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePage.this, what_is_page.class));
            }
        });
    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}