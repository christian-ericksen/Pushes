package com.austincjones.emaillab;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by austinjones on 2/25/16.
 */
public class ListViewFragment extends ListFragment {

    ArrayList<MercuryEmail> mArrayFromApi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //mListView = (ListView)findViewById(R.id.listView);
        mArrayFromApi = new ArrayList<MercuryEmail>();

        //Dummy Emails and EmailArrayAdapter
        MercuryEmail bob = new MercuryEmail("Bob","I like pickles");
        MercuryEmail johnny = new MercuryEmail("Johnny", "Warm showers please!");
        MercuryEmail jimJohn = new MercuryEmail("Jim John", "Gimme a sandwhich!");
        mArrayFromApi.add(bob);
        mArrayFromApi.add(johnny);
        mArrayFromApi.add(jimJohn);

        EmailArrayAdapter emailArrayAdapter = new EmailArrayAdapter(getActivity(),mArrayFromApi);
        setListAdapter(emailArrayAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
