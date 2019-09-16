package com.example.factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText1;
Button buttonP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText);
        buttonP=findViewById(R.id.button);
       // buttonP=findViewById(R.id.button);

       /* buttonP.setOnClickListener((v) {
            String s1= String.valueOf(n.getText());
            int n=Integer.parseInt(s1);
            int fact=1;*/

       buttonP.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String s1= String.valueOf(editText1.getText());
               int n=Integer.parseInt(s1);
               int fact=1;
               for (int i=1;i<=n;i++) {
                   fact = fact * i;
               }
               Toast.makeText(MainActivity.this, "factorial="+fact, Toast.LENGTH_SHORT).show();

           }
       });



        }


    }


