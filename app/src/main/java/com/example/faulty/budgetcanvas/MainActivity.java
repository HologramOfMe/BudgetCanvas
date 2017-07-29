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

        final EditText postCode = (EditText) findViewById(R.id.postCodeEditText);

        Button beginButton = (Button) findViewById(R.id.beginButton);
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPostCode = postCode.getText().toString();

                if (mPostCode.length() < 4) {
                    Toast.makeText(MainActivity.this, "Please enter a valid Post Code", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, BudgetCanvasActivity.class);
                    intent.putExtra(POST_CODE_KEY, mPostCode);

                    startActivity(intent);
                }

            }
        });
    }
}
