package pronetsimthai.app.kunchay.showpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ShowPro extends AppCompatActivity {

    // Exlicit
    private int anInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pro);

        //Get Value From Intent
        anInt = getIntent().getIntExtra("Index", 1);
        Log.d("9novV1", "Index ==> " + anInt);

    } // Main Method

} // Main Class
