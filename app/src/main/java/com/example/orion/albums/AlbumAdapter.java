package com.example.orion.albums;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Orion on 18/03/2017.
 */

public class AlbumAdapter extends BaseAdapter {
    Context contexto;
    List<Album> albumnes;

    public AlbumAdapter(Context contexto, List<Album> albumnes){
        this.contexto=contexto;
        this.albumnes=albumnes;
    }


    @Override
    public int getCount() {
        return albumnes.size();
    }

    @Override
    public Object getItem(int position) {
        return albumnes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if (convertView==null){
           convertView= LayoutInflater.from(contexto).inflate(R.layout.lista_album,null);
       }

        TextView tvNombreAlbum=(TextView) convertView.findViewById(R.id.tvNombreAlbum);
        TextView tvNombreArtista=(TextView) convertView.findViewById(R.id.tvNombreArtista);
        TextView tvValorAnio=(TextView) convertView.findViewById(R.id.tvValorAnio);

        ImageView ivFoto= (ImageView) convertView.findViewById(R.id.ivFoto);

        Album album=albumnes.get(position);

        tvNombreAlbum.setText(album.getTitulo());
        tvNombreArtista.setText(album.getArtista());
        String anio= String.valueOf(album.getAnio());
        tvValorAnio.setText(anio);
        ivFoto.setImageResource(album.getFoto());

        return null;
    }
}
