package me.chubbyhust.logger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.setEnabled(true);
        Logger.v("chubby");
        Logger.i("chubby");
        Logger.d("chubby");
        Logger.w("chubby");
        Logger.e("chubby");
    }
}
