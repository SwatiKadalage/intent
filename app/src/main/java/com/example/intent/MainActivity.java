package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt=(EditText) findViewById(R.id.txt1);
        Button b1=(Button) findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url=txt.getText().toString();
                Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
                intent.setData(Uri.parse(url));
                intent.putExtra(SearchManager.QUERY,url);
                startActivity(intent);
            }
        });

    }
}