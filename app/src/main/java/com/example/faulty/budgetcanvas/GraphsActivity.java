package com.example.faulty.budgetcanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GraphsActivity extends AppCompatActivity {

    private String mPostCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        Intent budgetIntent = getIntent();
        mPostCode = budgetIntent.getStringExtra(MainActivity.POST_CODE_KEY);

        TextView postCodeMessageLabel = (TextView) findViewById(R.id.postCodeMessageLabel);
        postCodeMessageLabel.setText("Your Post Code is " + mPostCode);
    }
}
