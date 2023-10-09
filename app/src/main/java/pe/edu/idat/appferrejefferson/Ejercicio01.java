package pe.edu.idat.appferrejefferson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appferrejefferson.databinding.ActivityEjercicio01Binding;

public class Ejercicio01 extends AppCompatActivity implements View.OnClickListener {


    private ActivityEjercicio01Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEjercicio01Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Integer horas = Integer.parseInt(binding.txthoras.getText().toString());
        Integer minutos = Integer.parseInt(binding.txtminutos.getText().toString());
        Double costo = calcularCostoEstacionamiento(horas, minutos);
        binding.txtresultado.setText("El precio de su estacionamiento es: " +  costo);

    }

    private Double calcularCostoEstacionamiento(Integer horas,Integer minutos) {

        int totalMinutos = horas * 60 + minutos;

        double costo = totalMinutos * 1500.0/60;

        return costo;

    }
}




