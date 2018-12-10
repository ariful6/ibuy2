package com.example.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button button40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button40 = (Button) findViewById(R.id.Blogin);
    }

    public void gonext3(View v) {


                Intent i = new Intent(LoginActivity.this, BranchSelection.class);

                startActivity(i);

    }
}
