package com.example.ibuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {
    Button Bregister;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Bregister= (Button) findViewById(R.id.Bregister);
    }

    public void onSignUpClick(View view)
    {
        if (view.getId()== R.id.Bregister)
        {
            EditText name= (EditText)findViewById(R.id.Euname);
            EditText uname= (EditText)findViewById(R.id.Euname);
            EditText email= (EditText)findViewById(R.id.Eemail);
            EditText pass1= (EditText)findViewById(R.id.Epass1);
            EditText pass2= (EditText)findViewById(R.id.Epass2);

            String namestr  = name.getText().toString();
            String unamestr  = uname.getText().toString();
            String emailstr  = email.getText().toString();
            String pass1str  = pass1.getText().toString();
            String pass2str  = pass2.getText().toString();

            if (!pass1str.equals(pass2str))
            {
                Toast pass = Toast.makeText(Register.this , "Passwords did not match!" , Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                contact c = new contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertcontact(c);
            }
        }
    }

    public void gonext(View v){
        Intent intent = new Intent(this,BranchSelection.class);
        startActivity(intent);
    }
}
