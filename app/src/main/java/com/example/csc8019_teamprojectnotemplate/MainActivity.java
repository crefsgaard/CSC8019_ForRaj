package com.example.csc8019_teamprojectnotemplate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//Inspiration: https://www.geeksforgeeks.org/how-to-implement-bottom-navigation-with-activities-in-android/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.home:
                        return true;
                    case R.id.booking:
                        startActivity(new Intent(getApplicationContext(),BookingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.route:
                        startActivity(new Intent(getApplicationContext(),RouteActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.restaurants:
                        startActivity(new Intent(getApplicationContext(),RestaurantsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.attractions:
                        startActivity(new Intent(getApplicationContext(),AttractionsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}