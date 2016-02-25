package com.austincjones.emaillab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Array of emails will recieve from API
    ArrayList<MercuryEmail> mArrayFromApi;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.listView);
        mArrayFromApi = new ArrayList<MercuryEmail>();

        //Dummy Emails and EmailArrayAdapter
        MercuryEmail bob = new MercuryEmail("Bob","I like pickles");
        MercuryEmail johnny = new MercuryEmail("Johnny", "Warm showers please!");
        MercuryEmail jimJohn = new MercuryEmail("Jim John", "Gimme a sandwhich!");
        mArrayFromApi.add(bob);
        mArrayFromApi.add(johnny);
        mArrayFromApi.add(jimJohn);



        EmailArrayAdapter emailArrayAdapter = new EmailArrayAdapter(MainActivity.this,mArrayFromApi);
        mListView.setAdapter(emailArrayAdapter);
    }


}
