package com.eduardo.listapaises;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    List<Pais> paises;
    PaisAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        paises = new ArrayList<Pais>();
        paises.add(new Pais(1,"China",1354040000, 2));
        paises.add(new Pais(2,"India", 1210193422, 4 ));
        paises.add(new Pais(3,"United States", 31576100, 3 ));
        paises.add(new Pais(4,"Indonesia", 237641326, 4 ));
        paises.add(new Pais(5,"Brazil", 193946886, 0 ));
        paises.add(new Pais(6,"Pakistan", 182912000, 9 ));
        paises.add(new Pais(7,"Nigeria", 170901000, 7 ));
        paises.add(new Pais(8,"Bangladesh", 152518015, 1 ));
        paises.add(new Pais(9,"Russia", 143369806, 8 ));
        paises.add(new Pais(10,"Japan", 98099, 6 ));
        listView.setAdapter(new PaisAdapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Pais pais = (Pais) adapterView.getItemAtPosition(i);
        Toast.makeText(this,pais.nome, Toast.LENGTH_SHORT).show();
    }
}