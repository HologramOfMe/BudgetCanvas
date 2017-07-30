package com.example.faulty.budgetcanvas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mPostCode;
    public static final String POST_CODE_KEY = "POST_CODE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText for user entered post code data
        final EditText postCode = (EditText) findViewById(R.id.postCodeEditText);

        // Set OnClickListener for begin button
        Button beginButton = (Button) findViewById(R.id.beginButton);
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get text from the EditText
                mPostCode = postCode.getText().toString();

                // check for a valid post code
                if (mPostCode.length() < 4) {

                    // produce a message to inform user they need to enter valid post code
                    Toast.makeText(MainActivity.this, "Please enter a valid Post Code", Toast.LENGTH_LONG).show();
                }else {
                    // start the BudgetCanvasActivity passing through the user entered post code
                    Intent intent = new Intent(MainActivity.this, BudgetCanvasActivity.class);
                    intent.putExtra(POST_CODE_KEY, mPostCode);

                    startActivity(intent);
                }

            }
        });
    }
}
