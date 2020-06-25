package br.ead;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DataBaseManager extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "sistema.db";
    private static final int VERSION = 1;

    public DataBaseManager(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Esportes.class);
        }catch (Exception exception){
            Log.e("DATABASE","Não foi possível criar a base de dados.",exception);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Esportes.class, true);
            onCreate(database, connectionSource);
        }catch (Exception exception){
            Log.e("DATABASE","Não foi possível atualizar a base de dados.",exception);
        }
    }
}
