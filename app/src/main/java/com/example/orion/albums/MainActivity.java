package com.example.orion.albums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvAlbum;
    List<Album> albumnes = new ArrayList<Album>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlbum=(ListView) findViewById(R.id.lvAlbum);
        generarAlbumnes();
        lvAlbum.setAdapter(new AlbumAdapter(this,albumnes));
    }
    private void generarAlbumnes(){
        albumnes.add(new Album("Abbey Road", "Bettles", 2016, R.mipmap.abbeyroad,null));
        albumnes.add(new Album("Agaetis Byrjun", "Sigur Ros", 2016, R.mipmap.agaetisbyrjun,null));
        albumnes.add(new Album("Number of the Beast", "Iron Maiden", 2003, R.mipmap.numberofthebeast,null));
        albumnes.add(new Album("Queenii", "Queen", 2017, R.mipmap.queenii,null));
    }
}
