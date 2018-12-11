package com.example.ibuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    DatabaseHelper helper= new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void gonext3(View v) {
        if(v.getId() == R.id.Blogin)
        {
            EditText a = (EditText)findViewById(R.id.Eusername);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.Epassword);
            String pass= b.getText().toString();
        }
        String password = helper.searchPass(toString());
        if (password.equals(password))
        {
            Intent i = new Intent(LoginActivity.this, BranchSelection.class);
            i.putExtra("Username",toString());
            startActivity(i);
        }
        else
        {
            Toast temp = Toast.makeText(LoginActivity.this , "Username and Passwords did not match!" , Toast.LENGTH_SHORT);
            temp.show();
        }
    }
}
