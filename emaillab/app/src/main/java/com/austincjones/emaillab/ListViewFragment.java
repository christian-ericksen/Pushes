package com.austincjones.emaillab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by austinjones on 2/25/16.
 */
public class ListViewFragment extends ListFragment {

    ArrayList<MercuryEmail> mArrayFromApi;
    OnEmailSelectedListener mListener;

    public interface OnEmailSelectedListener{
        public void onEmailSelected(int position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnEmailSelectedListener)getActivity();
        } catch (ClassCastException e){
            e.printStackTrace();
        }
    }

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

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        MainActivity mainActivity = (MainActivity) getActivity();

        if (mainActivity.isTwoPanes()) {
            //mListener = (OnEmailSelectedListener)mainActivity;
            mListener.onEmailSelected(position);
        } else {
            Intent detailsViewIntent = new Intent(getContext(), DetailsActivity.class);
            detailsViewIntent.putExtra("POSITION", position);
            startActivity(detailsViewIntent);
        }
    }
}
