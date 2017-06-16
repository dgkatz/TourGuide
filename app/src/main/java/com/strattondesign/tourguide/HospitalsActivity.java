package com.strattondesign.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hosp1), getString(R.string.hosp1Loc), R.drawable.hospital));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_hospitals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
