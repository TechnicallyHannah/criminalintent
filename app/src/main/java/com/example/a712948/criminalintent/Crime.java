package com.example.a712948.criminalintent;

import java.util.UUID;

/**
 * @author Hannah Paulson
 * @since 8/7/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Crime() {

        //generate unique identifier
        mId = UUID.randomUUID();
    }
}
