package com.example.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BranchSelection extends AppCompatActivity {

    Button button4;
    Button button5;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_selection);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVusername);

        button4 = (Button)findViewById(R.id.Blogin);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
    }
    public void goList (View view){
        Intent intent = new Intent(this, ProductList.class);
        startActivity(intent);
    }

}
