package com.example.henry.lab1_2seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String cad="";
    SeekBar seekBar;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView2.setText("");
                cad="";
                textView.setText(progress+"");
                for (int i=0;i<seekBar.getMax();i++){
                    cad+= progress+"x"+(i+1)+" ="+progress*(i+1)+"\n";
                }

                textView2.setText(cad);



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
