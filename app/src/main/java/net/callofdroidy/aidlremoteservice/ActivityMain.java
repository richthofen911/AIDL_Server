package net.callofdroidy.aidlremoteservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_fire).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("clicked", "");
                startService(new Intent(ActivityMain.this, RemoteWebPageService.class));
            }
        });

    }

}
