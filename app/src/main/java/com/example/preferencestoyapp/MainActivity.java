package com.example.preferencestoyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.preference.PreferenceManager;

import com.example.preferencestoyapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbar);

        // This sets default values for your preferences by reading preference XML
        // file - it use each's `defaultValue` and `key` attributes to do so.
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);

        // This only works because this Activity IS NOT `singleTop`, thus it is re-created
        // every time it is accessed - even when going up/back.
        boolean switchState = PreferenceManager
                .getDefaultSharedPreferences(this)
                .getBoolean(getString(R.string.perf_switch_key), false);
        binding.textView.setText(String.valueOf(switchState));
    }

    /**
     * @return true to show the menu - false to not show it.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_preferences, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_preferences_id) {
            startActivity(new Intent(this, PreferenceActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
