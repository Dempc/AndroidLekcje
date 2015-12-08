package com.example.student7.aaa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private EditText adresurlView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle intentExtras = getIntent() .getExtras();
        String username = intentExtras.getString("username");
        TextView helloView = (TextView)findViewById(R.id.hello);
        helloView.setText("Witaj " + username + "!");
        adresurlView = (EditText) findViewById(R.id.adresurl);

    }

    public void openClicked(View view){
        String adresurl = adresurlView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://"+adresurl));
        startActivity(intent);
    }
}
