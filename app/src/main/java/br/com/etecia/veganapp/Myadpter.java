package br.com.etecia.veganapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Myadpter extends RecyclerView.Adapter<Myadpter.ViewHolder> {

    private Context mContexto;

    private List<Filmes> lstFilmes;

    //criando o contrutor da classe com parametros


    public Myadpter(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater . inflate(R.layout.modelo_filmes,parent,false);


        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTituloFilmes.setText(lstFilmes.get(position).getTitulo());
        holder.idImagemFilmes.setImageResource(lstFilmes.get(position).getImagem());

        holder.idCardFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent()
            }
        });


    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTituloFilmes;
        ImageView idImagemFilmes;
        CardView idCardFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idTituloFilmes = itemView.findViewById(R.id.idtitulofilmes);
            idImagemFilmes = itemView.findViewById(R.id.idimgfilmes);
            idCardFilmes = itemView.findViewById(R.id.idcardfilmes);
        }
    }

}
