package com.austincjones.emaillab;

/**
 * Created by austinjones on 2/25/16.
 */
public class MercuryEmail {

    public String mName;
    public String mInfo;

    public MercuryEmail(String name, String info){
        mName = name;
        mInfo = info;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }
}
