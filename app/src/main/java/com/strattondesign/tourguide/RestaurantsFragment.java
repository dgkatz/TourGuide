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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.rest1), getString(R.string.rest1Loc), R.drawable.regina));
        dataWord.add(new DataWord(getString(R.string.rest2), getString(R.string.rest2Loc), R.drawable.duncan));
        dataWord.add(new DataWord(getString(R.string.rest3), getString(R.string.rest3Loc), R.drawable.chinapearl));
        dataWord.add(new DataWord(getString(R.string.rest4), getString(R.string.rest4Loc), R.drawable.bovas));
        dataWord.add(new DataWord(getString(R.string.rest1), getString(R.string.rest1Loc), R.drawable.regina));
        dataWord.add(new DataWord(getString(R.string.rest1), getString(R.string.rest1Loc), R.drawable.regina));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
