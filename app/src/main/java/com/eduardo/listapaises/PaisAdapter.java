package com.eduardo.listapaises;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PaisAdapter extends BaseAdapter{
    Context ctx;
    List<Pais> lista;

    public PaisAdapter(Context ctx, List<Pais> lista) {
        this.ctx = ctx;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //1º passo
        Pais pais = lista.get(i);

        //2º passo
        View linha = LayoutInflater.from(ctx).inflate(R.layout.linha,null);

        //3º passo
        TextView rank = (TextView) linha.findViewById(R.id.rank);
        TextView nome = (TextView) linha.findViewById(R.id.nome);
        TextView pop = (TextView) linha.findViewById(R.id.pop);
        ImageView img = (ImageView) linha.findViewById(R.id.imagem);

        TypedArray fotos = ctx.getResources().obtainTypedArray(R.array.paises);
        rank.setText(pais.getRank());
        nome.setText(pais.getNome());
        pop.setText(pais.getPopulacao());
        img.setImageDrawable(fotos.getDrawable(pais.getImagem()));
        return linha;
    }
}
