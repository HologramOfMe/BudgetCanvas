package com.example.faulty.budgetcanvas;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class BudgetCanvasActivity extends ListActivity{ //AppCompatActivity

    private ArrayList<Bucket> mBuckets = new ArrayList<>();
    private String mPostCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_canvas);

        // Get the intent used to start this activity and extract the user post code
        Intent mainIntnet = getIntent();
        mPostCode = mainIntnet.getStringExtra(MainActivity.POST_CODE_KEY);

        // Add Bucket objects to mBuckets ArrayList
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

        // Initialise and set the adapter which will adapt the Bucket objects
        // to  list items
        BucketAdapter adapter = new BucketAdapter(this, mBuckets);
        setListAdapter(adapter);

        // Set an onClickListener for the showGraphsButton
        Button showGraphsButton = (Button) findViewById(R.id.showGraphsButton);
        showGraphsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the GraphsActivity
                Intent intent = new Intent(BudgetCanvasActivity.this, GraphsActivity.class);
                intent.putExtra(MainActivity.POST_CODE_KEY, mPostCode);
                startActivity(intent);
            }
        });
    }
}
