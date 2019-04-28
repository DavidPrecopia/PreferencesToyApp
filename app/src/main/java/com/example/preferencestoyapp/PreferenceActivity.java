package com.example.preferencestoyapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.preferencestoyapp.databinding.ActivityPreferenceBinding;

public class PreferenceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The only reason I am setting the content view is to add a Toolbar.
        // Otherwise, a content view is not needed.
        ActivityPreferenceBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_preference);

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle(R.string.menu_item_preferences_title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // You add the PreferenceFragment the same way you add a normal Fragment.
        getSupportFragmentManager()
                .beginTransaction()
                .add(binding.preferenceFragmentHolder.getId(), new PreferenceFragment())
                .commit();
    }
}
