package com.example.labfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements Articulo1.OnFragmentInteractionListener, Articulo2.OnFragmentInteractionListener{

    Articulo1 fragment1;
    Articulo2 fragment2;
    TextView titulo;
    RadioGroup radioGroup;
    RadioButton rd1, rd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new Articulo1();
        fragment2 = new Articulo2();
        radioGroup = findViewById(R.id.radioGroup1);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.commit();
    }

    public void Boton1(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        titulo = findViewById(R.id.titulo);
        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.commit();

        if(rd1.isChecked()==true){
            titulo.setText(R.string.title1);
            fragmentTransaction.replace(R.id.contenedor1, fragment1);
        }
        else {
            fragmentTransaction.replace(R.id.contenedor1, fragment2);
        }
    }

    public void Boton2(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        titulo = findViewById(R.id.titulo);
        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.commit();

        if(rd2.isChecked()==true){
            titulo.setText(R.string.title2);
            fragmentTransaction.replace(R.id.contenedor1, fragment2);
        }
        else {
            fragmentTransaction.replace(R.id.contenedor1, fragment1);
        }
    }
}
