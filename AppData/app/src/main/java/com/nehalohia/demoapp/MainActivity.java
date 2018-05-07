package com.nehalohia.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickConvert(View view) {

        EditText edittext = (EditText) findViewById(R.id.editText);
        Double num = Double.parseDouble(edittext.getText().toString());
        Double curr = num*65.21;
        Log.i("Info", curr.toString());
        Toast.makeText(MainActivity.this, curr.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

