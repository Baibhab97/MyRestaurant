package com.example.baibhab.myrestaurant;

/* Created by Baibhab Debnath*/

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layer3 extends AppCompatActivity {

    Button layer3option1_btn_var, layer3option2_btn_var, layer3option3_btn_var, layer3option4_btn_var;
    String flag, option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer3);

        flag = getIntent().getStringExtra("flag");
        option = getIntent().getStringExtra("option");

        layer3option1_btn_var = findViewById(R.id.layer3option1_btn);
        layer3option2_btn_var = findViewById(R.id.layer3option2_btn);
        layer3option3_btn_var = findViewById(R.id.layer3option3_btn);
        layer3option4_btn_var = findViewById(R.id.layer3option4_btn);

        if (flag.equals("lunch")) {
            switch (option) {

                case "1" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option1_btn_var.setText("Thali");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, thali.class);
                                    startActivity(intent);
                                }
                            });

                            break;

                case "2" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option2_btn_var.setVisibility(View.VISIBLE);
                            layer3option3_btn_var.setVisibility(View.VISIBLE);
                            layer3option4_btn_var.setVisibility(View.VISIBLE);

                            layer3option1_btn_var.setText("Rice");
                            layer3option2_btn_var.setText("Roti");
                            layer3option3_btn_var.setText("Dal");
                            layer3option4_btn_var.setText("Vegetables");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, rice.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option2_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, roti.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option3_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, dal.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option4_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, vegetables.class);
                                    startActivity(intent);
                                }
                            });
                            
                            break;

                case "3" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option2_btn_var.setVisibility(View.VISIBLE);
                            layer3option3_btn_var.setVisibility(View.VISIBLE);

                            layer3option1_btn_var.setText("Egg");
                            layer3option2_btn_var.setText("Chicken");
                            layer3option3_btn_var.setText("Mutton");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, egg.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option2_btn_var.setOnClickListener(new View.OnClickListener() {
                               @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, chicken.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option3_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, mutton.class);
                                    startActivity(intent);
                                }
                            });

                            break;
            }
        }

        else {
            switch (option) {

                case "1" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option2_btn_var.setVisibility(View.VISIBLE);

                            layer3option1_btn_var.setText("Plain");
                            layer3option2_btn_var.setText("Stuffed");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, plain.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option2_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, stuffed.class);
                                    startActivity(intent);
                                }
                            });

                            break;

                case "2" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option2_btn_var.setVisibility(View.VISIBLE);
                            layer3option3_btn_var.setVisibility(View.VISIBLE);
                            layer3option4_btn_var.setVisibility(View.VISIBLE);

                            layer3option1_btn_var.setText("Dosa");
                            layer3option2_btn_var.setText("Idli");
                            layer3option3_btn_var.setText("Bada");
                            layer3option4_btn_var.setText("Combo");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, dosa.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option2_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, idli.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option3_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, bada.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option4_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, combo.class);
                                    startActivity(intent);
                                }
                            });

                            break;

                case "3" :  layer3option1_btn_var.setVisibility(View.VISIBLE);
                            layer3option2_btn_var.setVisibility(View.VISIBLE);

                            layer3option1_btn_var.setText("Veg");
                            layer3option2_btn_var.setText("Non-Veg");

                            layer3option1_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, veg.class);
                                    startActivity(intent);
                                }
                            });

                            layer3option2_btn_var.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(layer3.this, nonveg.class);
                                    startActivity(intent);
                                }
                            });

                            break;
            }
        }
    }
}