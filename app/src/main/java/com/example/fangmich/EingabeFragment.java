package com.example.fangmich;

import android.app.AlertDialog;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EingabeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EingabeFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eingabe,container,false);
        Button userBut = (Button)view.findViewById(R.id.button2);
        userBut.setOnClickListener(this);
        //return inflater.inflate(R.layout.fragment_eingabe, container, false);
        return view;


    }
    @Override
    public void onClick(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        final View i = getLayoutInflater().inflate(R.layout.user_add,null);
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

        TextView name = getActivity().findViewById(R.id.textView);
        name.setText(user);

    }


}