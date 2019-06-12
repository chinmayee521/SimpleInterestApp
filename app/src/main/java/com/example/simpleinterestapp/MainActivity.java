package com.example.simpleinterestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
EditText e1;
EditText e2;
EditText e3;
TextView textView;
String s1,s2,s3;
double n1,n2,n3;
double si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView2);
        e3=findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();
                s3=e3.getText().toString().trim();

                if(s1.length()>5 || s2.length()>5 || s3.length()>2)
                {
                    textView.setText("Limit exceeded");
                }
                else {
                    n1 = Double.parseDouble(s1);
                    n2 =  Double.parseDouble(s2);
                    n3 =  Double.parseDouble(s3);
                    si = (n1 * n2 * n3) / 100;
                    //n1=si;
                    textView.setText(Double.toString(si));
                }

            }
        });



    }
}
