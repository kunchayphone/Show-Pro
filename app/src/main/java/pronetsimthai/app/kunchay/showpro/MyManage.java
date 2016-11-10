package pronetsimthai.app.kunchay.showpro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import pronetsimthai.app.kunchay.showpro.MyOpenHelper;

/**
 * Created by kunchay on 10/11/2559.
 */

public class MyManage {

    //Explicit
    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context) {
        this.context = context;

        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();


    }
}   //Main Class
