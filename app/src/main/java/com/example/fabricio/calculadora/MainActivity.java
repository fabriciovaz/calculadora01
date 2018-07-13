package com.example.fabricio.calculadora;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv1;
    private Button bt0;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button btPonto;
    private Button btC;
    private Button btEnter;
    private Button btSomar;
    private Button btSubtrair;
    private Button btMultiplicar;
    private Button btDividir;
    private Button btAf;
    private Button btA0;
    private Button btT;

    double w;
    double x;
    double y;
    double z;
    int controle=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv1 = (TextView) findViewById(R.id.tV1);
        tv1.setText("0");
        bt0 = (Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5 = (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = (Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = (Button) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = (Button) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt9 = (Button) findViewById(R.id.bt9);
        bt9.setOnClickListener(this);
        btC = (Button) findViewById(R.id.btC);
        btC.setOnClickListener(this);
        btPonto = (Button) findViewById(R.id.btPonto);
        btPonto.setOnClickListener(this);
        btEnter = (Button) findViewById(R.id.btEnter);
        btEnter.setOnClickListener(this);
        btSomar = (Button) findViewById(R.id.btSomar);
        btSomar.setOnClickListener(this);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btSubtrair.setOnClickListener(this);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);
        btMultiplicar.setOnClickListener(this);
        btDividir = (Button) findViewById(R.id.btDividir);
        btDividir.setOnClickListener(this);
        btAf = (Button) findViewById(R.id.btAf);
        btAf.setOnClickListener(this);
        btA0 = (Button) findViewById(R.id.btA0);
        btA0.setOnClickListener(this);
        btT = (Button) findViewById(R.id.btT);
        btT.setOnClickListener(this);


    }



    @Override
    public void onClick(View v){

        if (v.getId()==(R.id.bt0)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("0");
            x=Double.parseDouble(tv1.getText().toString());

            teste();

        }


        if (v.getId()==(R.id.bt1)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("1"); //tv1 exibe o valor de x
            x=Double.parseDouble(tv1.getText().toString()); //x recebe o prximo digito

        }

        if (v.getId()==(R.id.bt2)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("2");
            x=Double.parseDouble(tv1.getText().toString());

        }

        if (v.getId()==(R.id.bt3)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("3");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt4)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("4");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt5)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("5");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt6)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("6");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt7)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("7");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt8)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("8");
            x=Double.parseDouble(tv1.getText().toString());

        }
        if (v.getId()==(R.id.bt9)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append("9");
            x=Double.parseDouble(tv1.getText().toString());

        }

        if (v.getId()==(R.id.btPonto)){
            if (controle==0){tv1.setText("");controle=1;}
            tv1.append(".");
            x=Double.parseDouble(tv1.getText().toString());
        }

        if (v.getId()==(R.id.btC)){
            x=0;
            controle=0;
            tv1.setText("0");
        }

        if (v.getId()==(R.id.btEnter)) {

            w=z;
            z=y;
            y=x;
            controle=0;

        }


        if (v.getId()==(R.id.btAf)) {

            w=z;
            z=y;
            y=x;
            controle=0;

        }

        if (v.getId()==(R.id.btSomar)){

            if (y+x - Math.round(y+x)==0) {
                tv1.setText(Double.toString(y+x).replace(".0",""));
            }else{
                tv1.setText(Double.toString(y+x));
            }
            x=y+x;
            y=z;
            z=w;
            w=0;
            controle=0;
        }
        if (v.getId()==(R.id.btSubtrair)){

            if (y-x - Math.round(y-x)==0) {
                tv1.setText(Double.toString(y-x).replace(".0",""));
            }else{
                tv1.setText(Double.toString(y-x));
            }

            x=y-x;
            y=z;
            z=w;
            w=0;
            controle=0;
        }
        if (v.getId()==(R.id.btMultiplicar)){

            if (y*x - Math.round(y*x)==0) {
                tv1.setText(Double.toString(y*x).replace(".0",""));
            }else{
                tv1.setText(Double.toString(y*x));
            }

            x=y*x;
            y=z;
            z=w;
            w=0;
            controle=0;
        }
        if (v.getId()==(R.id.btDividir)){
            if (y/x - Math.round(y/x)==0) {
                tv1.setText(Double.toString(y / x).replace(".0", ""));
            }else{
                tv1.setText(Double.toString(y / x));
            }
            x=y/x;
            y=z;
            z=w;
            w=0;
            controle=0;
        }

    }

    public void teste() {


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               // my_button.setBackgroundResource(R.drawable.defaultcard);
            }
        }, 2000);
    }


    }



