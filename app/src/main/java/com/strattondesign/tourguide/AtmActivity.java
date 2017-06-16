package com.strattondesign.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.atm1), getString(R.string.atm1Loc),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.atm1), getString(R.string.atm1Loc),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.atm1), getString(R.string.atm1Loc),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.atm1), getString(R.string.atm1Loc),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.atm1), getString(R.string.atm1Loc),R.drawable.atm_machine));


        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_atm);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
