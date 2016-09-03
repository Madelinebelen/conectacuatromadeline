package com.example.madel_000.conectacuatromadeline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by madel_000 on 20/12/2015.
 */
public class screen_splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);
        Thread mithread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent empezarpantalla =new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(empezarpantalla);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mithread.start();

    }
}
