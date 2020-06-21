package com.example.firstjsontest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonAdapter.OnItemClickListener {

   public static final String EXTRA_URL = "imageUrl";
   public static final String EXTRA_NAME = "dishName";
   public static final String EXTRA_CATEGORY = "strCategory";
   public static final String EXTRA_INSTRUCTIONS = "strInstructions";
   public static final String EXTRA_INGREDIENT1 = "strIngredient1";
   public static final String EXTRA_INGREDIENT2 = "strIngredient2";
   public static final String EXTRA_INGREDIENT3 = "strIngredient3";
   public static final String EXTRA_INGREDIENT4 = "strIngredient4";
   public static final String EXTRA_INGREDIENT5 = "strIngredient5";
   public static final String EXTRA_INGREDIENT6 = "strIngredient6";
   public static final String EXTRA_MEASURE1 = "strMeasure1";
   public static final String EXTRA_MEASURE2 = "strMeasure2";
   public static final String EXTRA_MEASURE3 = "strMeasure3";
   public static final String EXTRA_MEASURE4 = "strMeasure4";
   public static final String EXTRA_MEASURE5 = "strMeasure5";
   public static final String EXTRA_MEASURE6 = "strMeasure6";




    private RecyclerView mRecyclerView;
    private JsonAdapter mJsonAdapter;
    private ArrayList<ExampleItem> mExampleList;
    private RequestQueue mRequestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



        mExampleList = new ArrayList<>();

        Context context;
        mRequestQueue = Volley.newRequestQueue(this);
        parseJSON();
    }


    private void parseJSON() {
        String url = "https://www.themealdb.com/api/json/v1/1/search.php?s";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("meals");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject meal = jsonArray.getJSONObject(i);
                                String dishName = meal.getString("strMeal");
                                String imageUrl = meal.getString("strMealThumb");
                                String strCategory = meal.getString("strCategory");
                                String strInstructions = meal.getString("strInstructions");
                                String strIngredient1 = meal.getString("strIngredient1");
                                String strIngredient2 = meal.getString("strIngredient2");
                                String strIngredient3 = meal.getString("strIngredient3");
                                String strIngredient4 = meal.getString("strIngredient4");
                                String strIngredient5 = meal.getString("strIngredient5");
                                String strIngredient6 = meal.getString("strIngredient6");
                                String strMeasure1 = meal.getString("strMeasure1");
                                String strMeasure2 = meal.getString("strMeasure2");
                                String strMeasure3 = meal.getString("strMeasure3");
                                String strMeasure4 = meal.getString("strMeasure4");
                                String strMeasure5 = meal.getString("strMeasure5");
                                String strMeasure6 = meal.getString("strMeasure6");

                                mExampleList.add(new ExampleItem(imageUrl, dishName, strCategory,strInstructions, strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strMeasure1, strMeasure2, strMeasure3, strMeasure4, strMeasure5, strMeasure6));
                            }
                            mJsonAdapter = new JsonAdapter(MainActivity.this, mExampleList);
                            mRecyclerView.setAdapter(mJsonAdapter);
                            mJsonAdapter.setOnItemClickListener(MainActivity.this);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mRequestQueue.add(request);
    }

    @Override
    public void onItemClick(int position) {


        Intent detailIntent = new Intent(this, DetailActivity.class);
        ExampleItem clickedItem = mExampleList.get(position);


        detailIntent.putExtra(EXTRA_URL, clickedItem.getmImageUrl());
        detailIntent.putExtra(EXTRA_NAME, clickedItem.getCreator());
        detailIntent.putExtra(EXTRA_CATEGORY, clickedItem.getCategoryCount());
        detailIntent.putExtra(EXTRA_INSTRUCTIONS, clickedItem.getInstructions());
        detailIntent.putExtra(EXTRA_INGREDIENT1, clickedItem.getmIngredient1());
        detailIntent.putExtra(EXTRA_INGREDIENT2, clickedItem.getmIngredient2());
        detailIntent.putExtra(EXTRA_INGREDIENT3, clickedItem.getmIngredient3());
        detailIntent.putExtra(EXTRA_INGREDIENT4, clickedItem.getmIngredient4());
        detailIntent.putExtra(EXTRA_INGREDIENT5, clickedItem.getmIngredient5());
        detailIntent.putExtra(EXTRA_INGREDIENT6, clickedItem.getmIngredient6());
        detailIntent.putExtra(EXTRA_MEASURE1, clickedItem.getmMeasure1());
        detailIntent.putExtra(EXTRA_MEASURE2, clickedItem.getmMeasure2());
        detailIntent.putExtra(EXTRA_MEASURE3, clickedItem.getmMeasure3());
        detailIntent.putExtra(EXTRA_MEASURE4, clickedItem.getmMeasure4());
        detailIntent.putExtra(EXTRA_MEASURE5, clickedItem.getmMeasure5());
        detailIntent.putExtra(EXTRA_MEASURE6, clickedItem.getmMeasure6());



        startActivity(detailIntent);
    }
}
