package com.example.henry.lab1_2seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String cad="";
    SeekBar seekBar;
    TextView textView, textView2;

    ListView lista;
    ArrayAdapter<String> adapter;
    String valores[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        lista = findViewById(R.id.listview);

        valores = new String[30];
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,valores);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView2.setText("");
                //cad="";
                textView.setText(progress+"");
                for (int i=0;i<seekBar.getMax();i++){
                    //cad+= progress+"x"+(i+1)+" ="+progress*(i+1)+"\n";
                    valores[i] = progress+"x"+(i+1)+" ="+progress*(i+1);
                }
                lista.setAdapter(adapter);
                //textView2.setText(cad);



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
