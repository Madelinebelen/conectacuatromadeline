package com.example.madel_000.conectacuatromadeline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1jugador= (Button) findViewById(R.id.boton1);
        Button btn2jugador=(Button) findViewById(R.id.boton2);


        btn1jugador.setOnClickListener(this);
        btn2jugador.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent intent = null;
        switch (item.getItemId())
        {
            case R.id.comosejuega:

                intent=new Intent(MainActivity.this, comosejuega.class);
                startActivity(intent);

                break;
            case R.id.informacion:
                intent=new Intent(MainActivity.this, informacion.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.boton1:
                Intent intent = new Intent("android.intent.action.PERSONA");
                startActivity(intent);
                break;
            case  R.id.boton2:
                Intent intent1 = new Intent("android.intent.action.multijugador");
                startActivity(intent1);
                break;
            default:
                break;
        }

    }
}
