package com.example.vpatel52.studyapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends Activity {
    EditText ET_Name, ET_USER_NAME, ET_USER_PASS;

    String name,user_name,user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ET_Name=(EditText) findViewById(R.id.create_name);
        ET_USER_NAME=(EditText) findViewById(R.id.create_user_name);
        ET_USER_PASS=(EditText) findViewById(R.id.create_password);

    }

    public void userReg(View view){

        name=ET_Name.getText().toString();
        user_name=ET_USER_NAME.getText().toString();
        user_pass=ET_USER_PASS.getText().toString();
        String method="register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_pass);
        finish();
    }

}
