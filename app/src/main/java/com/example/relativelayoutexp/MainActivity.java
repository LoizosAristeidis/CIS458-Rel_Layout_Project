package com.example.relativelayoutexp;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hide the title bar
        getSupportActionBar().hide();
        //Hide the status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void redclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the RED Button." , Toast.LENGTH_SHORT ).show();
    }

    public void orangeclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the ORANGE Button." , Toast.LENGTH_SHORT ).show();
    }

    public void yellowclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the YELLOW Button." , Toast.LENGTH_SHORT ).show();
    }

    public void greenclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the GREEN Button." , Toast.LENGTH_SHORT ).show();
    }

    public void indigoclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the INDIGO Button." , Toast.LENGTH_SHORT ).show();
    }

    public void blueclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the BLUE Button." , Toast.LENGTH_SHORT ).show();
    }

    public void violetclick(View v) {
        Toast.makeText(getBaseContext(), "You touched the VIOLET Button." , Toast.LENGTH_SHORT ).show();
    }
}
