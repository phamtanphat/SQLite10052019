package khoapham.ptp.phamtanphat.sqlite10052019;

import android.content.Context;

public class SingletonDatabase {
    private static SQLite sqLite = null;

    private SingletonDatabase(){

    }
    public static SQLite getInstance(Context context){
        if (sqLite == null){
            sqLite = new  SQLite(context,"Quanlymonan.sql",null , 1);
        }
        return sqLite;
    }

}
