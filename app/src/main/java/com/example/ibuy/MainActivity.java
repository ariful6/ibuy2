package com.example.ibuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button17);
    }

    public void gonext(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void gonext2(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void gonext11(View v) {
        Intent intent = new Intent(this, BranchSelection.class);
        startActivity(intent);

    }
}
