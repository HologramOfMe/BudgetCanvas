package com.example.faulty.budgetcanvas;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BudgetCanvasActivity extends ListActivity{ //AppCompatActivity

    private ArrayList<Bucket> mBuckets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_canvas);

        mBuckets.add(new Bucket("Education"));
        mBuckets.add(new Bucket("Healthcare"));
        mBuckets.add(new Bucket("Defense"));
        mBuckets.add(new Bucket("Public Services"));
        mBuckets.add(new Bucket("Public Safety"));
        mBuckets.add(new Bucket("Social Security"));
        mBuckets.add(new Bucket("Housing/Homelessness"));
        mBuckets.add(new Bucket("Recreation/Culture"));
        mBuckets.add(new Bucket("Energy"));
        mBuckets.add(new Bucket("Primary Industry"));
        mBuckets.add(new Bucket("Mining/Manufacturing/Construction"));
        mBuckets.add(new Bucket("Transport/Communication"));
        mBuckets.add(new Bucket("Environment"));
        mBuckets.add(new Bucket("Other"));

        BucketAdapter adapter = new BucketAdapter(this, mBuckets);
        setListAdapter(adapter);
    }
}
