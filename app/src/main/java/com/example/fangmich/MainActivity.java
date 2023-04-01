package com.example.fangmich;

import static com.example.fangmich.R.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EingabeFragment inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

    }/*

    public void adduser(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final View i = getLayoutInflater().inflate(layout.user_add,null);
        alert.setTitle("Name");
        alert.setView(i);

        alert.setPositiveButton("OK",(dialog, which) -> {
            EditText editText = i.findViewById(R.id.editText);
            newuser(editText.getText().toString());
        });
        AlertDialog dialog = alert.create();
        dialog.show();
    }
    public void newuser(String user){

        TextView name = findViewById(id.textView);
        name.setText(user);

    }*/
    public void quit(View view){
        System.exit(0);
    }

    public void mische(View view){
        Spielfeld.change();
    }


}