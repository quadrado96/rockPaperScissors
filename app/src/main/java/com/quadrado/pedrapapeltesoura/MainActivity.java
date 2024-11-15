package com.quadrado.pedrapapeltesoura;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public String escolhaDoUsuario;


    public void selecionarPedra(View view) {
        escolhaDoUsuario = "pedra";
        verificarGanhador(escolhaDoUsuario);
    }

    public void selecionarTesoura(View view) {
        escolhaDoUsuario = "tesoura";
        verificarGanhador(escolhaDoUsuario);
    }

    public void selecionarPapel(View view) {
        escolhaDoUsuario = "papel";
        verificarGanhador(escolhaDoUsuario);
    }

    public String gerarEscolhaDoApp() {
        String[] opcoes = {
                "pedra",
                "papel",
                "tesoura"
        };

        ImageView imgEscolha = findViewById(R.id.imgEscolha);
        int numero = new Random().nextInt(3);
        String escolhaDoApp = opcoes[numero];

        switch (escolhaDoApp) {
            case "pedra":
                imgEscolha.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgEscolha.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgEscolha.setImageResource(R.drawable.tesoura);
                break;
        }

        return escolhaDoApp;
    }

    public void verificarGanhador(String escolhaDoUsuario) {
        String escolhaDoApp = gerarEscolhaDoApp();
        TextView resultado = findViewById(R.id.txtResultadoMesmo);

        if (
                (escolhaDoUsuario.equals("pedra") && escolhaDoApp.equals("papel")) ||
                (escolhaDoUsuario.equals("papel") && escolhaDoApp.equals("tesoura")) ||
                (escolhaDoUsuario.equals("tesoura") && escolhaDoApp.equals("pedra"))) {
            resultado.setText("Você perdeu! :(");
        } else if (
                (escolhaDoUsuario.equals("pedra") && escolhaDoApp.equals("tesoura")) ||
                (escolhaDoUsuario.equals("papel") && escolhaDoApp.equals("pedra")) ||
                (escolhaDoUsuario.equals("tesoura") && escolhaDoApp.equals("papel"))) {
            resultado.setText("Você venceu!! :D");
        } else {
            resultado.setText("Empatou. '-'");
        }
    }


}