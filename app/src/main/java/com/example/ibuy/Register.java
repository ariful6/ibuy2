package com.example.ibuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Register extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button3= (Button) findViewById(R.id.button);
    }

    public void gonext(View v){
        Intent intent = new Intent(this,BranchSelection.class);
        startActivity(intent);
    }
}
