package com.example.csc8019_teamprojectnotemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.homeFragment);

    }

    //Inspiration for navigation bar: https://www.geeksforgeeks.org/bottom-navigation-bar-in-android/
    HomeFragment homeFragment = new HomeFragment();
    BookingFragment bookingFragment = new BookingFragment();
    RouteFragment routeFragment = new RouteFragment();
    RestaurantsFragment restaurantsFragment = new RestaurantsFragment();
    AttractionsFragment attractionsFragment = new AttractionsFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.homeFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
            return true;
        }

        else if (item.getItemId() == R.id.bookingFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, bookingFragment).commit();
            return true;
        }

        else if (item.getItemId() == R.id.routeFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, routeFragment).commit();
            return true;
        }

        else if (item.getItemId() == R.id.restaurantsFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, restaurantsFragment).commit();
            return true;
        }

        else if (item.getItemId() == R.id.attractionsFragment) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, attractionsFragment).commit();
            return true;
        }

        else {
            return false;
        }
    }
}