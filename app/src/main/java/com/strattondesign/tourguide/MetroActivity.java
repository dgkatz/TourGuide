package com.strattondesign.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MetroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));
        dataWord.add(new DataWord(getString(R.string.metro1), getString(R.string.metro1Loc), R.drawable.metro));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_metro);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
