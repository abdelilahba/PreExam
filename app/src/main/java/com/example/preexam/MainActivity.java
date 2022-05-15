package com.example.preexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button btnini , bntcalculer;
    RadioGroup rg1 , rg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        btnini=findViewById(R.id.btninitialiser);
        bntcalculer=findViewById(R.id.btncalculer);
        btnini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed1.requestFocus();

            }
        });
        bntcalculer.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
               int a=0;
                int b=0;
                if (rg1.getCheckedRadioButtonId()==R.id.rd1){
                     a= (int) (Integer.parseInt(ed1.getText().toString())*13.5+500.3*Integer.parseInt(ed2.getText().toString()));
                    Toast.makeText(MainActivity.this, a, Toast.LENGTH_SHORT).show();
                }else {
                     b= (int) (Integer.parseInt(ed1.getText().toString())*13.5+500.3*Integer.parseInt(ed2.getText().toString()));
                    Toast.makeText(MainActivity.this, b, Toast.LENGTH_SHORT).show();

                }
                if (b!=0){
                    switch (rg2.getCheckedRadioButtonId()){
                        case R.id.rd3:
                            double c= b*13.12;
                            break;
                        case R.id.rd4:
                            double d= b*13.12;
                            break;
                        case R.id.rd5:
                            double e= b*13.12;
                            break;
                        case R.id.rd6:
                            double f= b*13.12;
                            break;
                    }

                }else{
                    switch (rg2.getCheckedRadioButtonId()){
                        case R.id.rd3:
                            double c= a*13.12;
                            break;
                        case R.id.rd4:
                            double d= a*13.12;
                            break;
                        case R.id.rd5:
                            double e= a*13.12;
                            break;
                        case R.id.rd6:
                            double f=(double) a*13.12;
                            break;
                    }
                }
                if (ed1.getText()==null && ed2.getText()==null && ed3.getText()==null ){
                    Toast.makeText(MainActivity.this, "erreur", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}