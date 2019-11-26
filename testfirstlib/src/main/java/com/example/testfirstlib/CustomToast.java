package com.example.testfirstlib;

import android.content.Context;
import android.widget.Toast;

public class CustomToast
{
    public static void showToast(Context context,String message,int length)
    {
        Toast.makeText(context, ""+message, length).show();
    }
}
