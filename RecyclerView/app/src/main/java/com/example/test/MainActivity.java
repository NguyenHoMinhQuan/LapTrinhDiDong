package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClicked {

    RecyclerView recyclerView;
    androidVersionAdapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<androidVersion> people;
    Button btadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.ListR);
        btadd = findViewById(R.id.btadd);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<>();
        people.add(new androidVersion("Cupcake", "1.5", "Cupcake"));
        people.add(new androidVersion("Donut", "1.6", "donut"));
        people.add(new androidVersion("Eclair", "2.0-2.1", "eclair"));
        people.add(new androidVersion("Gingerbread", "2.2-2.3", "gingerbread"));
        people.add(new androidVersion("Honeycomb", "2.3-3.7", "honeycomb"));
        people.add(new androidVersion("Ice Cream Sandwich", "3.0-3.2.6", "icecreamsandwich"));
        people.add(new androidVersion("JellyBean", "4.0-4.3.1", "jellybean"));
        people.add(new androidVersion("Kitkat", "4.4-4.4.4", "kitkat"));
        people.add(new androidVersion("Lollipop", "5.0-5.1.1", "lollipop"));
        people.add(new androidVersion("Marshmallow", "6.0-6.0.1", "marshmallow"));

        myAdapter = new androidVersionAdapter(this, people);
        recyclerView.setAdapter(myAdapter);

        btadd.setOnClickListener(view -> {
            people.add(new androidVersion("Android Q", "10.0.0_r64", "Q"));
            myAdapter.notifyDataSetChanged();
        });
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, people.get(index).getName(), Toast.LENGTH_SHORT).show();
    }
}
