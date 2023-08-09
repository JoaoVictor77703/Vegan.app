package br.com.etecia.veganapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lista;

    //declarar o recycle view

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView=findViewById(R.id.lista);

        lista = new ArrayList<>();

        lista.add(
                new Filmes("Apocalipse",
                        "Filme Terro",
                        "Terror",
                        R.drawable.apocalipe););
        lista.add(
                new Filmes("Comida",
                        "Comida",
                        "Comida",
                        R.drawable.comida););
        lista.add(
                new Filmes("Folha",
                        "Folhas",
                        "natureza",
                        R.drawable.folha);

        );


        //criando classe adaptadora e passando parametros
        Myadpter adpter = new Myadpter(getApplicationContext(),lista);

        //tipo de layout q a lista vai seguir
        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //fixador de tamanho da lista - deixar mais rapida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recycle view  ao adaptador
        idRecyclerView.setAdapter(adpter);

    }
}