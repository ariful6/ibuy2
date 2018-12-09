package com.example.ibuy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProductList extends AppCompatActivity {

    Button button15;

     Counter counter;
     Counter counter1;
    Counter counter2;
    Counter counter3;

     TextView showText;
     TextView showText1;
    TextView showText2;
    TextView showText3;
    TextView showText4;

    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        counter = new Counter();
        counter1 = new Counter();
        counter2 = new Counter();
        counter3 = new Counter();
        showText = findViewById(R.id.editText8);
        showText1 = findViewById(R.id.editText9);
        showText2 = findViewById(R.id.editText10);
        showText3 = findViewById(R.id.editText11);
        showText4 = findViewById(R.id.editText12);
        showText.setText(Double.toString(counter.getcounter()));
        showText1.setText(Double.toString(counter.getcounter()));
        showText2.setText(Double.toString(counter.getcounter()));
        showText3.setText(Double.toString(counter.getcounter()));
        showText4.setText(Double.toString(counter.getcounter()));


        button15 = findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProductList.this, PaymentMethod.class);
                st=showText4.getText().toString();
                i.putExtra("value", st);
                startActivity(i);
                finish();
            }
        });


    }

    private void updateTotal(){
        Double total;
        Double r1 = 2.99, r2 = 2.59, m = 8.99, c = 4.99;


        total = (counter.getcounter()*r1)+(counter1.getcounter()*r2)+(counter2.getcounter()*m)+(counter3.getcounter()*c);
        showText4.setText(Double.toString(total));
    }


    public void button7(View view) {
        counter.increment();
        showText.setText(Double.toString(counter.getcounter()));
        updateTotal();
    }

    public void button8 (View view){
        counter.decrement();
        showText.setText(Double.toString(counter.getcounter()));
        updateTotal();
    }
    public void button9(View view) {
        counter1.increment();
        showText1.setText(Double.toString(counter1.getcounter()));
        updateTotal();
    }

    public void button10 (View view) {
        counter1.decrement();
        showText1.setText(Double.toString(counter1.getcounter()));
        updateTotal();
    }
    public void button12(View view) {
        counter2.increment();
        showText2.setText(Double.toString(counter2.getcounter()));
        updateTotal();
    }

    public void button14 (View view){
        counter2.decrement();
        showText2.setText(Double.toString(counter2.getcounter()));
        updateTotal();
    }
    public void button11(View view) {
        counter3.increment();
        showText3.setText(Double.toString(counter3.getcounter()));
        updateTotal();
    }

    public void button13 (View view) {
        counter3.decrement();
        showText3.setText(Double.toString(counter3.getcounter()));
        updateTotal();
    }

    public void goProduct(View v) {
        Intent intent = new Intent(this, PaymentMethod.class);
        startActivity(intent);
    }
}



