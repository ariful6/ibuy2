package com.example.ibuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentMethod extends AppCompatActivity {

    Button button7;
    TextView textView17;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);


        button7 = (Button) findViewById(R.id.button7);
        textView17 = (TextView)findViewById(R.id.textView17);



        st=getIntent().getExtras().getString("value");
        textView17.setText(st);



    }



    public void gopay(View v) {
        Intent intent = new Intent(PaymentMethod.this, CardDetails.class);
        startActivity(intent);
    }
}
