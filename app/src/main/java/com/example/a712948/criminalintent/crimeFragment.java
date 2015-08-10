package com.example.a712948.criminalintent;

import android.app.Fragment;
import android.os.Bundle;


public class crimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

}
