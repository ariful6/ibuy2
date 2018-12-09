package com.example.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class LoginActivity extends AppCompatActivity {

    Button button40;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


        public void gonext3 (View v){
            Intent intent = new Intent(this, BranchSelection.class);
            button40 = (Button) findViewById(R.id.button40);
            startActivity(intent);
        }
    }
