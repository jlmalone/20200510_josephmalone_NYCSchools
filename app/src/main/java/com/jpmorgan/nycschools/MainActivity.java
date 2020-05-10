package com.jpmorgan.nycschools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initNavigation();
    }

    @Override
    public boolean onSupportNavigateUp() {
       return  navController.navigateUp();
    }

    @Override
    public void onBackPressed() {
        navController.navigateUp();
    }

    private void initNavigation() {

        navController = Navigation.findNavController(this,
                R.id.main_nav_host);
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();

        NavigationUI.setupActionBarWithNavController(this,
                navController,
                appBarConfiguration);
    }


}