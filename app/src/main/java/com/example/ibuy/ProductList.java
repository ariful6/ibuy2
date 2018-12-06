package com.example.ibuy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProductList extends AppCompatActivity {
    Button button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        button15 = (Button) findViewById(R.id.button15);
    }

    public void goProduct(View v) {
        Intent intent = new Intent(ProductList.this, PaymentMethod.class);
        startActivity(intent);
    }
}



