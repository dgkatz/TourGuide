package com.strattondesign.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hot1), getString(R.string.hol1Loc), R.drawable.hotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.colorPrimaryDark);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
