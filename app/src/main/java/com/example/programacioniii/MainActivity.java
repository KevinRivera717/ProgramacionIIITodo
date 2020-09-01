package com.example.programacioniii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular (View view ) {
        try{
        RadioGroup Operaciones = (RadioGroup) findViewById(R.id.Operaciones);
            Spinner OperacioneSP = (Spinner)  findViewById(R.id.OperacionesSP );
        TextView VAl = (TextView) findViewById(R.id.Num1);
        double num1 = Double.parseDouble(VAl.getText().toString());

        VAl = (TextView) findViewById(R.id.Num2);
        double num2 = Double.parseDouble(VAl.getText().toString());

        double respuesta = 0;
        switch (Operaciones.getCheckedRadioButtonId()) {
            case R.id.OptSuma:
                respuesta = num1 + num2;
                break;
            case R.id.OptResta:
                respuesta = num1 - num2;
                break;
            case R.id.OptMultiplicacion:
                respuesta = num1 * num2;
                break;
            case R.id.OptDividir:
                respuesta = num1 / num2;
                break;

        }

        switch (OperacioneSP .getSelectedItemPosition() ){
            case 1: //suma
                respuesta = num1 + num2;
                break;
            case 2://resta
                respuesta = num1 - num2;
                break;
            case  3://multiplicar
                respuesta = num1 * num2;
                break;
            case  4://dividir
                respuesta = num1 / num2;
                break;

        }

        VAl = (TextView) findViewById(R.id.ResultadoTV);
        VAl.setText("Resultado: " + respuesta);

    }catch (Exception err){
            Toast.makeText(getApplicationContext(),"por favor ingrese los numeros", Toast.LENGTH_LONG).show();
        }

    }
}