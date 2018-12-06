package com.example.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button4 = (Button) findViewById(R.id.button4);
    }

    public void gonext3(View v) {
        Intent intent = new Intent(this, BranchSelection.class);
        startActivity(intent);
    }
}
