package com.example.crimeinvestigation.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crimeinvestigation.R;

public class Complaint extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.complaint, viewGroup, false);
    }
}
