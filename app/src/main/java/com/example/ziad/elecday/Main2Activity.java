package com.example.ziad.elecday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void btnSaveClick(View v){
        Bundle bundle=getIntent().getExtras();
        boolean pc=bundle.getBoolean("pc");
        boolean ps=bundle.getBoolean("ps");
        boolean pe=bundle.getBoolean("pe");
        boolean ihec=bundle.getBoolean("ihec");
        String notes = bundle.getString("notes");
        //TextView tx=(TextView)findViewById(R.id.textView2);
        //tx.setText(notes);

        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        intent.putExtra("pc",pc);
        intent.putExtra("ps",ps);
        intent.putExtra("pe",pe);
        intent.putExtra("ihec",ihec);
        intent.putExtra("notes",notes);
        intent.putExtra("rate",ratingBar.getRating());
        startActivity(intent);
    }
}
