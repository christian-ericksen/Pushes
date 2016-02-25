package com.austincjones.emaillab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by austinjones on 2/25/16.
 */

// Custom email adapter to be placed in the listview fragments


    public class EmailArrayAdapter extends ArrayAdapter<MercuryEmail> {
        ArrayList<MercuryEmail> mArray;

        public EmailArrayAdapter(Context context, ArrayList<MercuryEmail> newArrayOfEmails) {
            super(context, -1);

            mArray = new ArrayList<MercuryEmail>();
            mArray.addAll(newArrayOfEmails);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // Replace the R.layout.email_item with custom layout
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View emailItemLayout = inflater.inflate(R.layout.email_item,parent,false);

            // Replace the textviews with the objects inside the custom layout
            TextView nameTextView = (TextView)emailItemLayout.findViewById(R.id.item_name);
            TextView infoTextView = (TextView)emailItemLayout.findViewById(R.id.item_info);

            MercuryEmail mercuryEmail = mArray.get(position);

            nameTextView.setText(mercuryEmail.getName());
            infoTextView.setText(mercuryEmail.getInfo());

            return emailItemLayout;
        }

        @Override
        public int getCount() {
            return mArray.size();
        }
}
