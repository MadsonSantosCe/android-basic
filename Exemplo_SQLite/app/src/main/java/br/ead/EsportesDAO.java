package br.ead;

import android.content.Context;

class EsportesDAO extends GenericDao<Esportes> {
    public EsportesDAO(Context context){
        super(context, Esportes.class);
    }
}
