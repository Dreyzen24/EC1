package pe.edu.idat.appferrejefferson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appferrejefferson.databinding.ActivityEjercicio01Binding;
import pe.edu.idat.appferrejefferson.databinding.ActivityEjercicio02Binding;

public class Ejercicio02 extends AppCompatActivity implements View.OnClickListener{


    private ActivityEjercicio02Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEjercicio02Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnverificar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
            if (v.getId() == R.id.btnverificar) {

                String yearOfBirthString = binding.txtfecha.getText().toString();

                if (!yearOfBirthString.isEmpty()) {
                    int yearOfBirth = Integer.parseInt(yearOfBirthString);
                    int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

                    if (currentYear - yearOfBirth >= 18) {
                        binding.txtresultadofecha.setText("Debes sacar el DNI.");
                    } else {
                        binding.txtresultadofecha.setText("Eres menor de edad.");
                    }
                } else {
                    binding.txtresultadofecha.setText("Por favor, ingresa tu año de nacimiento.");
                }
            }
        }
    }

