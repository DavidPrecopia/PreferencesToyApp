package com.example.preferencestoyapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

// This is the same as any other PreferenceFragment
public class SyncPreferenceFragment extends PreferenceFragmentCompat implements Preference.OnPreferenceChangeListener {


    // Again, you do need a constructor nor `onCreateView`

//    public SyncPreferenceFragment() {
//        // Required empty public constructor
//    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        TextView textView = new TextView(getActivity());
//        textView.setText(R.string.hello_blank_fragment);
//        return textView;
//    }


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_sync, rootKey);

        findPreference(getString(R.string.perf_sync_checkbox_key)).setOnPreferenceChangeListener((preference, newValue) -> {
            Toast.makeText(getContext(), "Checkbox changed", Toast.LENGTH_LONG).show();
            return true;
        });
    }


    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }
}
