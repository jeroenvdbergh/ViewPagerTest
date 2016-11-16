package com.example.user.viewpagertest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener {


    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);

        Button myButton = (Button) view.findViewById(R.id.button2);
        myButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {




        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id., DetailFragment.newInstance())
                .addToBackStack(null)
                .commit();

    }
}
