package com.dxxx.fileselectmoudle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yis.file.activity.FolderActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this,FolderActivity.class),1);
            }
        });
    }
}
