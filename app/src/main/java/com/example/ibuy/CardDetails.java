package com.example.ibuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CardDetails extends AppCompatActivity {

    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        button16 = (Button)findViewById(R.id.button16);

    }
    public void gonext3 (View view){
        Intent intent = new Intent(this, BranchSelection.class);
        startActivity(intent);
    }

}
