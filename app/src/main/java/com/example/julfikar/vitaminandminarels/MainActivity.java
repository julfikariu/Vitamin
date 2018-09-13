package com.example.julfikar.vitaminandminarels;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vitaminintro,vitamina,vitaminb,vitaminc,vitamind,vitamine,vitamink,mypicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // each variable set specific button id

        vitaminintro = findViewById(R.id.vitaminintro);
        vitamina = findViewById(R.id.vitamina);
        vitaminb = findViewById(R.id.vitaminb);
        vitaminc = findViewById(R.id.vitaminc);
        vitamind = findViewById(R.id.vitamind);
        vitamine = findViewById(R.id.vitamine);
        vitamink = findViewById(R.id.vitamink);
        mypicture = findViewById(R.id.developer);

        // Function of each button when click

        //        for developer
        mypicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mypictureshow();
            }
        });

        //        for vitamin
        vitaminintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctionintro();
            }
        });

        //        for vitamin a
        vitamina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctiona();
            }
        });

        //        for vitamin b
       vitaminb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctionb();
            }
        });

       //        for vitamin c
       vitaminc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctionc();
            }
        });

       //        for vitamin d
       vitamind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctiond();
            }
        });
       //        for vitamin e
       vitamine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctione();
            }
        });
       //        for vitamin k
       vitamink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfunctionk();
            }
        });


    }


    private void openfunctionintro() {
        Intent vfunction = new Intent(this,VitaminFunction.class);
        startActivity(vfunction);
    }

    private void mypictureshow() {
        Intent myimg = new Intent(this,MyPicture.class);
        startActivity(myimg);
    }

    private void openfunctiona() {
        Intent obj_vitamina=new Intent(this,VitaminFunctiona.class);
        startActivity(obj_vitamina);
    }
    private void openfunctionb() {
        Intent obj_vitaminb=new Intent(this,VitaminFunctionb.class);
        startActivity(obj_vitaminb);
    }
    private void openfunctionc() {
        Intent obj_vitaminc=new Intent(this,VitaminFunctionc.class);
        startActivity(obj_vitaminc);
    }
    private void openfunctiond() {
        Intent obj_vitamind = new Intent(this,VitaminFunctiond.class);
        startActivity(obj_vitamind);
    }

    private void openfunctione() {
        Intent obj_vitamine=new Intent(this,VitaminFunctione.class);
        startActivity(obj_vitamine);
    }

    private void openfunctionk() {
        Intent obj_vitamink =new Intent(this,VitaminFunctionk.class);
        startActivity(obj_vitamink);
    }


    // WHen back pressed then show yes or no

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.setTitle("Alert Title ???");
        alertDialog.show();


    }


}
