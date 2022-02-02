package com.example.mydashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView cardhome,cardchat,cardprofile,cardwidget,cardsettings,cardlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardhome=findViewById(R.id.cardhome);
        cardchat=findViewById(R.id.cardchat);
        cardprofile=findViewById(R.id.cardprofile);
        cardwidget=findViewById(R.id.cardwidget);
        cardsettings=findViewById(R.id.cardsetting);
        cardlogout=findViewById(R.id.cardlogout);

        cardhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 showToast("Home Clicked");
            }
        });
        cardchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Chat Clicked");
            }
        });
        cardprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Profile Clicked");
            }
        });
        cardwidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Widget Clicked");
            }
        });
        cardsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Settings Clicked");
            }
        });
        cardlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 showToast("Logout Clicked");
            }
        });

    }
    private void showToast(String Message){
        Toast.makeText(this, Message,Toast.LENGTH_SHORT).show();
    }
}