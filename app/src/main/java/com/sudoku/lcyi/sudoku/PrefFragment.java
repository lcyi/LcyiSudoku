package com.sudoku.lcyi.sudoku;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Qi on 2015/6/10.
 */
public class PrefFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
