package com.mosso.logginmvp.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.mosso.logginmvp.R;
import com.mosso.logginmvp.models.Usuario;

import java.util.List;

/**
 * Created by isaigarciamoso on 24/01/18.
 */

public class AdapterFood extends RecyclerView.Adapter<AdapterFood.ViewHolder> {
    private List<Usuario> usuarios;
    private Context context;
    private onItemClickRobert onItemClickRobert;



    public interface onItemClickRobert{

        void onItemClick(Usuario usuario);

    }

    public AdapterFood() {
    }

    public AdapterFood(List<Usuario> usuarios, Context context, AdapterFood.onItemClickRobert onItemClickRobert) {
        this.usuarios = usuarios;
        this.context = context;
        this.onItemClickRobert = onItemClickRobert;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
