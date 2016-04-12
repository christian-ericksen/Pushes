package com.austincjones.emaillab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ListViewFragment.OnEmailSelectedListener {

    private boolean mTwoPanes = false;

    public boolean isTwoPanes(){
        return mTwoPanes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.austincjones.emaillab.R.layout.activity_main);

        if (findViewById(R.id.detailsFragment) != null) {
            mTwoPanes = true;
        }

    }

    public void onEmailSelected(int selectedEmail){
        DetailsFragment detailsFragment = (DetailsFragment)getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.setDetailText(selectedEmail);
    }

}
