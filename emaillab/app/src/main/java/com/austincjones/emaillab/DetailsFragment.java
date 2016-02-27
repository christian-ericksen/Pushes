package com.austincjones.emaillab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by austinjones on 2/25/16.
 */
public class DetailsFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate based on the details_fragment_layout.xml class
        return inflater.inflate(com.austincjones.emaillab.R.layout.detail_fragment_layout,container,false);
    }
    // This method will receive a reference to the clicked email
    public void setDetailText(int position){
    // With position we will get specific email then place email values into the detail_fragment_layout
//        Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView)getView().findViewById(R.id.detailsTextView);
        textView.setText("clicked on " + //Integer.toString
        String.valueOf(position));
    }
}
