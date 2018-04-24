package com.example.baibhab.myrestaurant;

/* Created by Baibhab Debnath*/

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lunch_btn_var, breakfast_btn_var, option1_btn_var, option2_btn_var, option3_btn_var, back1_btn_var;
    String flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lunch_btn_var = findViewById(R.id.lunch_btn);
        breakfast_btn_var = findViewById(R.id.breakfast_btn);
        option1_btn_var = findViewById(R.id.option1_btn);
        option2_btn_var = findViewById(R.id.option2_btn);
        option3_btn_var = findViewById(R.id.option3_btn);
        back1_btn_var = findViewById(R.id.back1_btn);


        lunch_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag = "lunch";

                option1_btn_var.setText("Thali");
                option2_btn_var.setText("Veg");
                option3_btn_var.setText("Non-Veg");
                option1_btn_var.setVisibility(View.VISIBLE);
                option2_btn_var.setVisibility(View.VISIBLE);
                option3_btn_var.setVisibility(View.VISIBLE);
                back1_btn_var.setVisibility(View.VISIBLE);

                lunch_btn_var.setVisibility(View.INVISIBLE);
                breakfast_btn_var.setVisibility(View.INVISIBLE);

            }
        });


        breakfast_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag = "breakfast";

                option1_btn_var.setText("Paratha");
                option2_btn_var.setText("South Indian");
                option3_btn_var.setText("Sandwiches");
                option1_btn_var.setVisibility(View.VISIBLE);
                option2_btn_var.setVisibility(View.VISIBLE);
                option3_btn_var.setVisibility(View.VISIBLE);
                back1_btn_var.setVisibility(View.VISIBLE);

                lunch_btn_var.setVisibility(View.INVISIBLE);
                breakfast_btn_var.setVisibility(View.INVISIBLE);

            }
        });

        back1_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lunch_btn_var.setVisibility(View.VISIBLE);
                breakfast_btn_var.setVisibility(View.VISIBLE);

                option1_btn_var.setVisibility(View.INVISIBLE);
                option2_btn_var.setVisibility(View.INVISIBLE);
                option3_btn_var.setVisibility(View.INVISIBLE);
                back1_btn_var.setVisibility(View.INVISIBLE);

            }
        });

        option1_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, layer3.class);
                intent.putExtra("flag", flag);
                intent.putExtra("option", "1");
                startActivity(intent);

            }
        });

        option2_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, layer3.class);
                intent.putExtra("flag", flag);
                intent.putExtra("option", "2");
                startActivity(intent);

            }
        });

        option3_btn_var.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, layer3.class);
                intent.putExtra("flag", flag);
                intent.putExtra("option", "3");
                startActivity(intent);

            }
        });
    }
}
