package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tourguide.Fragments.AttractionsFragment;
import com.example.tourguide.Fragments.HotelsFragment;
import com.example.tourguide.Fragments.MarketsFragment;
import com.example.tourguide.Fragments.RestaurantsFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setTitle(R.string.Restaurants);
        showFragments(new RestaurantsFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.restaurants){
            toolbar.setTitle(R.string.Restaurants);
            showFragments(new RestaurantsFragment());
        }

        if (id == R.id.markets){
            toolbar.setTitle(R.string.Markets);
            showFragments(new MarketsFragment());
        }

        if (id == R.id.attractions){
            toolbar.setTitle(R.string.Attractions);
            showFragments(new AttractionsFragment());
        }

        if (id == R.id.hotels){
            toolbar.setTitle(R.string.Hotels);
            showFragments(new HotelsFragment());
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showFragments(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
}
