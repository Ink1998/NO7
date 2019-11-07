package com.example.no7;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String string=intent.getStringExtra("level");
        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText("當前畫面2，畫面1傳來"+string);

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edittext = (EditText) findViewById(R.id.editText2);
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("level2", edittext .getText().toString());
                intent.putExtra("ctime",true);
                startActivity(intent);
            }
        });
    }
}
