package com.example.myfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    Toolbar toolbar;
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.nav_timer)
        {
            Intent intent1 = new Intent(HomePage.this, Timer.class);
            startActivity(intent1);
        }
        else if (id==R.id.nav_profile)
        {
            Intent intent2 = new Intent(HomePage.this, UserProfile.class);
            startActivity(intent2);
        }

        else if(id== R.id.nav_calc) {
            Intent intent3 = new Intent(HomePage.this, Recommendation.class);
            startActivity(intent3);
        }

        else if (id==R.id.nav_tracker)
        {
            Intent intent4 = new Intent(HomePage.this, FoodCalories.class);
            startActivity(intent4);
        }


        else if(id==R.id.nav_splits) {
            Intent intent5 = new Intent(HomePage.this, Splits.class);
            startActivity(intent5);
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}

