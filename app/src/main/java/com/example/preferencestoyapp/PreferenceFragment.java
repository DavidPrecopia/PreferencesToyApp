package com.example.preferencestoyapp;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class PreferenceFragment extends PreferenceFragmentCompat {

    // The constructor and onCreateView is not needed because I am adding this Fragment to an existing Activity.

//    public PreferenceFragment() {
//    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;
//    }

    // The preference Fragment is rooted at the PreferenceScreen using rootKey.
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
