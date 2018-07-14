package com.example.shubham.shubham_nav;


import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout =(DrawerLayout) findViewById(R.id.drawer_layout);
        actionBarDrawerToggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new HomeFragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("My Profile");
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
               switch (item.getItemId())
               {
                   case R.id.my_profile:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new HomeFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("My Profile");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();

                       break;

                   case R.id.stationery:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new MessageFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Stationery");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();

                       break;

                   case R.id.gifts:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new SettingsFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Gifts");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;


                   case R.id.handicraft:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new FragementWishlist());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Handicraft");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.sports:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new SportsFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("Sports");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.my_cart:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new CartFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("My Cart");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.my_wishlist:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new WishlistFragment());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("My Wishlist");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;

                   case R.id.contact_us:
                       item.setChecked(true);
                       drawerLayout.closeDrawers();

                       String[] receipient={"sushi9999@gmail.com"};

                       Intent intent=new Intent(Intent.ACTION_SEND);
                       intent.putExtra(Intent.EXTRA_EMAIL,receipient);
                       intent.putExtra(Intent.EXTRA_SUBJECT,"Bug Report");
                       intent.putExtra(Intent.EXTRA_TEXT,"Your complaint goes here!!");

                       intent.setType("message/rfc822");
                       startActivity(Intent.createChooser(intent,"Choose an Email client"));
                       break;

                   case R.id.logout:
                       finish();
                      // Intent in = new Intent(getApplicationContext(),LoginActivity.class);
                      // startActivity(in);
                       item.setChecked(true);
                       drawerLayout.closeDrawers();


                       break;

                   case R.id.about_us:
                       fragmentTransaction = getSupportFragmentManager().beginTransaction();
                       fragmentTransaction.replace(R.id.main_container,new AboutUsActivity());
                       fragmentTransaction.commit();
                       getSupportActionBar().setTitle("About Us");
                       item.setChecked(true);
                       drawerLayout.closeDrawers();
                       break;







               }



                return true;
            }
        });
    }

    @Override
    protected void onPostCreate( Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }
}
