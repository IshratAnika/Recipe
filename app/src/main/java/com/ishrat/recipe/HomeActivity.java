package com.ishrat.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnBurger,btnBiriyani,btnCake,btnPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnBurger=findViewById(R.id.btn_burger);
        btnBiriyani=findViewById(R.id.btn_biriyani);
        btnCake=findViewById(R.id.btn_cake);
        btnPizza=findViewById(R.id.btn_pizza);

        btnBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","1");
                startActivity(intent);

            }
        });

        btnBiriyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","2");
                startActivity(intent);

            }
        });

        btnCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","3");
                startActivity(intent);

            }
        });

        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","4");
                startActivity(intent);

            }
        });
    }
}
