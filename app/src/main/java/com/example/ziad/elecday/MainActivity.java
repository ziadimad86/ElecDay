package com.example.ziad.elecday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSaveClick(View v){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        CheckBox cb1,cb2,cb3,cb4;
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        EditText txt1=(EditText)findViewById(R.id.editText1);
        intent.putExtra("pc",cb1.isChecked());
        intent.putExtra("ps",cb2.isChecked());
        intent.putExtra("pe",cb3.isChecked());
        intent.putExtra("ihec",cb4.isChecked());
        //Toast.makeText(this,txt1.getText(),Toast.LENGTH_LONG).show();
        intent.putExtra("notes",txt1.getText().toString());
        startActivity(intent);

    }
}
