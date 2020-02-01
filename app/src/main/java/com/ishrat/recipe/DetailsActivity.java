package com.ishrat.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgRecipe;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgRecipe=findViewById(R.id.img_r);
        txtName=findViewById(R.id.txt_n);
        txtDescription=findViewById(R.id.txt_d);

        String getID=getIntent().getExtras().getString("id");

        if (getID.equals("1"))
        {
            imgRecipe.setImageResource(R.drawable.falafel_burgers);
            txtName.setText("Falafel Burger");
            txtDescription.setText(R.string.falafel_burger);
        }
        if (getID.equals("2"))
        {
            imgRecipe.setImageResource(R.drawable.chicken_biriyani);
            txtName.setText("Chicken Biriyani");
            txtDescription.setText(R.string.chicken_biriyani);
        }
        if (getID.equals("3"))
        {
            imgRecipe.setImageResource(R.drawable.cake);
            txtName.setText("Chocolate cake");
            txtDescription.setText(R.string.chocolate_cake);
        }
        if (getID.equals("4"))
        {
            imgRecipe.setImageResource(R.drawable.pizza);
            txtName.setText("Pizaa");
            txtDescription.setText(R.string.pizza);
        }
    }
}
