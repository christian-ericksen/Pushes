package com.austincjones.emaillab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int itemPositionClickedAndSentFromList = intent.getIntExtra("POSITION", 0);
        DetailsFragment detailsFragment = (DetailsFragment)getSupportFragmentManager().findFragmentById(R.id.detailsTextView);
        detailsFragment.setDetailText(1);
    }
}
