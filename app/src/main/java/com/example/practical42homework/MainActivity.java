package com.example.practical42homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    CheckBox chocolateSyrup;
    CheckBox sprinkles;
    CheckBox crushedNuts;
    CheckBox cherries;
    CheckBox orioCookieCrumbles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        String toast_message = "Toppings: ";

        chocolateSyrup = (CheckBox) findViewById(R.id.ChocolateSyrup);
        sprinkles = (CheckBox) findViewById(R.id.Sprinkles);
        crushedNuts = (CheckBox) findViewById(R.id.CrushedNuts);
        cherries = (CheckBox) findViewById(R.id.Cherries);
        orioCookieCrumbles = (CheckBox) findViewById(R.id.OrioCookieCrumbles);

        if(chocolateSyrup.isChecked()){
            toast_message = toast_message + " " + chocolateSyrup.getText();
        }
        if(sprinkles.isChecked()){
            toast_message = toast_message + " " + sprinkles.getText();
        }
        if(crushedNuts.isChecked()){
            toast_message = toast_message + " " + crushedNuts.getText();
        }
        if(cherries.isChecked()){
            toast_message = toast_message + " " + cherries.getText();
        }
        if(orioCookieCrumbles.isChecked()){
            toast_message = toast_message + " " + orioCookieCrumbles.getText();
        }
        Toast toast = Toast.makeText(this, toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
}