package com.sudoku.lcyi.sudoku;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Sudoku extends Activity implements OnClickListener {


    private static final int menu_setting = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);

        View continueButton = this.findViewById(R.id.continueButton);
        continueButton.setOnClickListener(this);
        View newGameButton = this.findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(this);
        View aboutButton = this.findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);
        View exitButton = this.findViewById(R.id.exitButton);
        exitButton.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aboutButton:
                Intent i = new Intent(this, About.class);
                startActivity(i);
                break;
        }


    }

FragmentManager fragmentManager = getFragmentManager();
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    PrefFragment prefFragment = new PrefFragment();

    transaction.add();
    transaction.commit();


}


