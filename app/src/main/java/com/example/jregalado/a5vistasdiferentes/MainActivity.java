package com.example.jregalado.a5vistasdiferentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SIGUIENTE,SIGUIENTE1,SIGUIENTE2,SIGUIENTE3,SIGUIENTE4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SIGUIENTE= (Button)findViewById(R.id.btn1);
        SIGUIENTE.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent SIGUIENTE1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(SIGUIENTE1);
            }
        });
    }
}





