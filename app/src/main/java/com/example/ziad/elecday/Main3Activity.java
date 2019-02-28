package com.example.ziad.elecday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Bundle bundle=getIntent().getExtras();
        boolean pc=bundle.getBoolean("pc");
        boolean ps=bundle.getBoolean("ps");
        boolean pe=bundle.getBoolean("pe");
        boolean ihec=bundle.getBoolean("ihec");
        String notes=bundle.getString("notes");
        float rate=bundle.getFloat("rate");

        StringBuilder sb=new StringBuilder();
        sb.append("Polling Center : ").append(pc);
        sb.append("\nPolling Station : ").append(ps);
        sb.append("\nPolitical Entity : ").append(pe);
        sb.append("\nIHEC : ").append(ihec);
        sb.append("\nNotes : ").append(notes);
        sb.append("\nRating : ").append(rate);

        TextView txt=(TextView)findViewById(R.id.textView3);
        txt.setText(sb.toString());
    }

    public void btnBackClick(View v){
        Intent intent=new Intent(Main3Activity.this,MainActivity.class);
        startActivity(intent);
    }


}
