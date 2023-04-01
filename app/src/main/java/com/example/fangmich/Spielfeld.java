package com.example.fangmich;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Spielfeld {
    static final CharSequence[] totouch = {"1","2","3","4","5","6","7","8","9","00","0","\u2191"};
    //private static Button[] buttons =

    static List<CharSequence> change(){
        List<CharSequence> list = Arrays.asList(totouch);
        Collections.shuffle(list);
        return list;
    }


    public Spielfeld() {

    }

}
