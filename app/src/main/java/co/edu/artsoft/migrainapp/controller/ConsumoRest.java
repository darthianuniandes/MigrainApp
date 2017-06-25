package co.edu.artsoft.migrainapp.controller;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import co.edu.artsoft.migrainapp.restutils.TestFragment;

import co.edu.artsoft.migrainapp.R;

/**
 * Created by darthian on 6/24/17.
 */

public class ConsumoRest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.consumo_prueba);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // if the screen is in landscape mode, we can show the
            // dialog in-line with the list so we don't need this activity.
            finish();
            return;
        }

        if (savedInstanceState == null) {
            TestFragment trendsFragment = new TestFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, trendsFragment).commit();
        }
    }
}
