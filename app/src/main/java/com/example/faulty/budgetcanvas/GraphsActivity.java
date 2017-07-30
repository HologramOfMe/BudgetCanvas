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

        // Get the intent used to start this activity and extract the user post code
        Intent budgetIntent = getIntent();
        mPostCode = budgetIntent.getStringExtra(MainActivity.POST_CODE_KEY);

        // Set the text view at top of activity using the user entered post code
        TextView postCodeMessageLabel = (TextView) findViewById(R.id.postCodeMessageLabel);
        postCodeMessageLabel.setText("Your Post Code is " + mPostCode);
    }
}
