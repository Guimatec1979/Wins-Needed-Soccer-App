package com.guimatec.vitriasnecessarias;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pontosLider, pontosLanterna;
    TextView txtnumeroVirotias;
    Button btnLimpar, btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pontosLider = findViewById(R.id.editpontosLider);
        pontosLanterna = findViewById(R.id.editpontosLanterna);

        txtnumeroVirotias = findViewById(R.id.txtnumeroVitoria);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontosLider.setText("");
                pontosLanterna.setText("");
                txtnumeroVirotias.setText("");


            }
        });

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int ptLider,ptLanterna,nVitorias;

                ptLider = Integer.parseInt(pontosLider.getText().toString());
                ptLanterna = Integer.parseInt(pontosLanterna.getText().toString());

                int resto = (ptLider - ptLanterna )% 3;

                if (resto == 0) {
                    nVitorias = (ptLider - ptLanterna) / 3;
                } else {
                    nVitorias = 1 + (ptLider - ptLanterna) /3;
                }

                txtnumeroVirotias.setText("" + nVitorias);


            }

        });

    }
}
