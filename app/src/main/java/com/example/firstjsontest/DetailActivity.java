package com.example.firstjsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.firstjsontest.MainActivity.EXTRA_CATEGORY;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT1;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT2;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT3;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT4;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT5;
import static com.example.firstjsontest.MainActivity.EXTRA_INGREDIENT6;
import static com.example.firstjsontest.MainActivity.EXTRA_INSTRUCTIONS;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE1;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE2;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE3;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE4;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE5;
import static com.example.firstjsontest.MainActivity.EXTRA_MEASURE6;
import static com.example.firstjsontest.MainActivity.EXTRA_NAME;
import static com.example.firstjsontest.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String dishName = intent.getStringExtra(EXTRA_NAME);
        String strCategory = intent.getStringExtra(EXTRA_CATEGORY);
        String strInstructions = intent.getStringExtra(EXTRA_INSTRUCTIONS);
        String strIngredient1 = intent.getStringExtra(EXTRA_INGREDIENT1);
        String strIngredient2 = intent.getStringExtra(EXTRA_INGREDIENT2);
        String strIngredient3 = intent.getStringExtra(EXTRA_INGREDIENT3);
        String strIngredient4 = intent.getStringExtra(EXTRA_INGREDIENT4);
        String strIngredient5 = intent.getStringExtra(EXTRA_INGREDIENT5);
        String strIngredient6 = intent.getStringExtra(EXTRA_INGREDIENT6);
        String strMeasure1 = intent.getStringExtra(EXTRA_MEASURE1);
        String strMeasure2 = intent.getStringExtra(EXTRA_MEASURE2);
        String strMeasure3 = intent.getStringExtra(EXTRA_MEASURE3);
        String strMeasure4 = intent.getStringExtra(EXTRA_MEASURE4);
        String strMeasure5 = intent.getStringExtra(EXTRA_MEASURE5);
        String strMeasure6 = intent.getStringExtra(EXTRA_MEASURE6);






        ImageView imageView = findViewById(R.id.image_detail);
        TextView textCategory = findViewById(R.id.text_detail);
        TextView textViewInstructions = findViewById(R.id.instruction);
        TextView textStrIngredient1 = findViewById(R.id.ingradient_one);
        TextView textStrIngredient2 = findViewById(R.id.ingradient_two);
        TextView textStrIngredient3 = findViewById(R.id.ingradient_three);
        TextView textStrIngredient4 = findViewById(R.id.ingradient_four);
        TextView textStrIngredient5 = findViewById(R.id.ingradient_five);
        TextView textStrIngredient6 = findViewById(R.id.ingradient_six);
        TextView textStrMeasure1 = findViewById(R.id.measure1);
        TextView textStrMeasure2 = findViewById(R.id.measure2);
        TextView textStrMeasure3 = findViewById(R.id.measure3);
        TextView textStrMeasure4 = findViewById(R.id.measure4);
        TextView textStrMeasure5 = findViewById(R.id.measure5);
        TextView textStrMeasure6 = findViewById(R.id.measure6);





        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textCategory.setText(strCategory);
        textViewInstructions.setText(strInstructions);


        textStrIngredient1.setText(strIngredient1);
        textStrIngredient2.setText(strIngredient2);
        textStrIngredient3.setText(strIngredient3);
        textStrIngredient4.setText(strIngredient4);
        textStrIngredient5.setText(strIngredient5);
        textStrIngredient6.setText(strIngredient6);


        textStrMeasure1.setText(strMeasure1);
        textStrMeasure2.setText(strMeasure2);
        textStrMeasure3.setText(strMeasure3);
        textStrMeasure4.setText(strMeasure4);
        textStrMeasure5.setText(strMeasure5);
        textStrMeasure6.setText(strMeasure6);


    }
}