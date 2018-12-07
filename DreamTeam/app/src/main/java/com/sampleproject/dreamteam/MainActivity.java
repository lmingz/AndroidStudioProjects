package com.sampleproject.dreamteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] dreamTeam = new String[] {"Alex", "Bob", "Chris", "Dave", "Ergou"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        ArrayAdapter<String> dreamTeamAdapter = new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1, dreamTeam);

        listView.setAdapter(dreamTeamAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //System.out.println("something is taped");

        Intent moveTODetailIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveTODetailIntent.putExtra("playerName", dreamTeam[position]);

        startActivity(moveTODetailIntent);
    }
}
