package com.cex.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class HelloWorld {

    public static void hello(Context context, String message){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }
}
